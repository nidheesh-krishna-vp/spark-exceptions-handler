package com.sparkexception.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;

import com.sparkexception.exceptions.CustomException;
import com.sparkexception.services.ExceptionHandler;

@Aspect
public class LoggingAspect {

	@Autowired
	private ExceptionHandler exceptionHandler;

	@AfterThrowing(pointcut = "@annotation(com.tsys.enterprise.batch.logging.HandleException)", throwing = "ex")
	public void afterThrowing(JoinPoint jp, Exception ex) {
		exceptionHandler.handleException((CustomException) ex);
	}
}
