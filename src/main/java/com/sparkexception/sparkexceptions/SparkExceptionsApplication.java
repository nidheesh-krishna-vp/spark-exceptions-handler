package com.sparkexception.sparkexceptions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.sparkexception.services.ExceptionTestService;

@SpringBootApplication
@ComponentScan(basePackages = { "com.sparkexception" })
public class SparkExceptionsApplication implements CommandLineRunner {
	@Autowired
	ExceptionTestService exceptionTestService;

	public static void main(String[] args) {
		SpringApplication.run(SparkExceptionsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Testing Exception Framework >>>>>>>>>>>>>>>>>>>");
		exceptionTestService.testExceptionOne(1);
	}
}
