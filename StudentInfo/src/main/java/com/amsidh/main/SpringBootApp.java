package com.amsidh.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.amsidh.mvc" })
public class SpringBootApp {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(SpringBootApp.class, args);
	}

}
