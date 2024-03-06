package com.example.jenkinsBasics;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class JenkinsBasicsApplicationTests {

	public  static Logger logger = LoggerFactory.getLogger(JenkinsBasicsApplicationTests.class);
	@Test
	void contextLoads() {

		logger.info("test case executing");
		assertEquals(true,true);
	}

}
