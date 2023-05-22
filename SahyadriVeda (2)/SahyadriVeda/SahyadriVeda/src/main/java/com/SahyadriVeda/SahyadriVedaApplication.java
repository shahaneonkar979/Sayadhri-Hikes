package com.SahyadriVeda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.src.dao")
@EntityScan("com.src.model")
@ComponentScan({"com.SahyadriVeda","com.src.controller","com.src.dao","com.src.model","com.src.service","com.src.serviceimpl"})

public class SahyadriVedaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SahyadriVedaApplication.class, args);
	}

}
