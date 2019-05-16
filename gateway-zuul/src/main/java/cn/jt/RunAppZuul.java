package cn.jt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy      //api网关
@EnableEurekaClient   //zuul服务要注册到Eureka上
public class RunAppZuul {

	public static void main(String[] args) {
		SpringApplication.run(RunAppZuul.class, args);
	}
}
