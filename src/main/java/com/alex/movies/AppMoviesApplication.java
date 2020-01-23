package com.alex.movies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class AppMoviesApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppMoviesApplication.class, args);
	}

}
