package com.spring.web.springBootServletDemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootServletDemoApplication extends SpringBootServletInitializer {

	@Value("${spring.application.name}")
	private String name;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootServletDemoApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(SpringBootServletDemoApplication.class);
	}
	
	 @RequestMapping(value = "/")
	   public String hello() {
	      return "Hello World from Tomcat with Application "+name;
	   }

}
