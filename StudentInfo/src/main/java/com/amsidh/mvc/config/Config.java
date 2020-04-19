package com.amsidh.mvc.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.amsidh.mvc.repositories")
@EntityScan(basePackageClasses= {com.amsidh.mvc.entities.Student.class})
@Configuration
@ComponentScan(basePackages= {"com.amsidh.mvc"})
public class Config {

}
