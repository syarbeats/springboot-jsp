package com.cdc.mitrais.springbootjsp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpringbootJspApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(SpringbootJspApplication.class, args);
	}
	
	 @Override
	 protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		 return application.sources(applicationClass);
	 }

	 private static Class<SpringbootJspApplication> applicationClass = SpringbootJspApplication.class;
}
