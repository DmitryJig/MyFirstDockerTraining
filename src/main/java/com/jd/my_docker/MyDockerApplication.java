package com.jd.my_docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyDockerApplication {

	public static void main(String[] args) {
//		System.setProperty("SPRING.PROFILES.ACTIVE", "dev"); // один из способов указать профиль
		SpringApplication.run(MyDockerApplication.class, args);
	}
}
