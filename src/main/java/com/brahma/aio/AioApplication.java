package com.brahma.aio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class AioApplication {

	public static void main(String[] args) {
		SpringApplication.run(AioApplication.class, args);
	}

}
