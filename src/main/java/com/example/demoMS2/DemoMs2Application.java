package com.example.demoMS2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DemoMs2Application {

	public static void main(String[] args) {
		SpringApplication.run(DemoMs2Application.class, args);
	}

}
