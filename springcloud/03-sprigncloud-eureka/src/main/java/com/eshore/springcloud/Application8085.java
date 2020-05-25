package com.eshore.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer //用于开启Eureka注册中心服务端
public class Application8085 {

	public static void main(String[] args) {
		SpringApplication.run(Application8085.class, args);
	}

}
