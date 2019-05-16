package cn.jt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import cn.jt.feign.EurekaServiceFeign;
import cn.jt.feign.SidecarServiceFeign;

@RestController
public class HelloController {

	@Autowired  //注入Feign接口
	private EurekaServiceFeign eurekaServiceFeign;
	@Autowired
	private SidecarServiceFeign sidecarServiceFeign;
	
	@RequestMapping("/hello/{name}")
	@HystrixCommand(fallbackMethod="helloFallBack")  //断路器命令注解
	public String hello(@PathVariable String name) {
		return eurekaServiceFeign.hello(name);
	}
	
	//该方法的返回值、参数和接口中定义的方法一致，当访问失败时，hystrix直接回调用此方法
	public String helloFallBack(String name) {
		return "zhangcheng";  	//失败调用时，返回默认值
	}
	
	//实现sidecar对nodejs的封装，返回欢迎页面
	@RequestMapping("/")
	public String node() {
		return sidecarServiceFeign.node();
	}
}
