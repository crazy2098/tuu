package cn.jt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class RunAppProviderUser2 {

	public static void main(String[] args) {
		SpringApplication.run(RunAppProviderUser2.class, args);
	}

}
