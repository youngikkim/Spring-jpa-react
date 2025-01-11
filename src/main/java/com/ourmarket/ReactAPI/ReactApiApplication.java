package com.ourmarket.ReactAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.ourmarket.ReactAPI.repository")
public class ReactApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReactApiApplication.class, args);
	}

}
