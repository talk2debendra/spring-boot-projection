package com.deb.poc.springbootprojection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@ComponentScan
@Configuration
@SpringBootApplication
public class SpringbootProjectionApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootProjectionApplication.class, args);
	}

}
