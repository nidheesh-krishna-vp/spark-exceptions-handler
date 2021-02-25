package com.sparkexception.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	Logger logger = LoggerFactory.getLogger(TestController.class);

	@GetMapping(value = "/sample-url")
	public ResponseEntity testMethod() {
		logger.info("inside test method");
		return null; 
	}
}
