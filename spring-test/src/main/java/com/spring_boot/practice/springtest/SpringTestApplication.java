package com.spring_boot.practice.springtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

//@ImportResource(locations = {"classpath:/bean.yml"})
@SpringBootApplication
public class SpringTestApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringTestApplication.class, args);

	}
}
