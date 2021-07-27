package com.dio.dio_servicediscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DioServicediscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(DioServicediscoveryApplication.class, args);
	}

}
