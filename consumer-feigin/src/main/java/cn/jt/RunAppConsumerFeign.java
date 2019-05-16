package cn.jt;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringCloudApplication   //feign是cloud
@EnableFeignClients   //开启Feign
public class RunAppConsumerFeign {

	public static void main(String[] args) {
		SpringApplication.run(RunAppConsumerFeign.class, args);
	}
}
