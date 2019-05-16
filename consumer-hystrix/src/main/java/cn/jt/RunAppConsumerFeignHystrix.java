package cn.jt;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringCloudApplication   //cloud背后集成了hystrix
@EnableFeignClients   //开启Feign  feign背后集成了ribbon
//@EnableCircuitBreaker  //开启hystrix
public class RunAppConsumerFeignHystrix {

	public static void main(String[] args) {
		SpringApplication.run(RunAppConsumerFeignHystrix.class, args);
	}
}
