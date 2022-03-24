package com.example.springtestingweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
/*
Includes:
@Configuration
@EnableAutoConfiguration
@EnableWebMvc
	@DispatcherServlet
	...
@ComponentScan
 */
public class SpringTestingWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringTestingWebApplication.class, args);
	}

}
