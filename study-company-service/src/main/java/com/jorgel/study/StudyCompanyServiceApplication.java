package com.jorgel.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class StudyCompanyServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudyCompanyServiceApplication.class, args);
	}
}
