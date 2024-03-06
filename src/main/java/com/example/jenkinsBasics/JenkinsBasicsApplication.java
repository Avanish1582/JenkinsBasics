package com.example.jenkinsBasics;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsBasicsApplication {

	public  static  Logger logger = LoggerFactory.getLogger(JenkinsBasicsApplication.class);

	public void init(){
		logger.info("Application Started");
	}


	public static void main(String[] args) {
		logger.info("Application Execuited ");
		SpringApplication.run(JenkinsBasicsApplication.class, args);
	}

}
