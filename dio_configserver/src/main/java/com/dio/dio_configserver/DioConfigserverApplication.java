package com.dio.dio_configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class DioConfigserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(DioConfigserverApplication.class, args);
	}

}
