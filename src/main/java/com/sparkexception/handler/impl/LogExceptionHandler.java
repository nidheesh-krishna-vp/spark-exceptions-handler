package com.sparkexception.handler.impl;

import org.springframework.stereotype.Component;

import com.sparkexception.exceptions.BaseException;
import com.sparkexception.handler.IExceptionHandler;
import com.sparkexception.models.ErrorInfo;

@Component
public class LogExceptionHandler implements IExceptionHandler<BaseException> {
	@Override
	public void handleException(final BaseException baseException) {
		final ErrorInfo errorInfo = baseException.getErrorInfo();
		if (errorInfo != null) {
			System.out.println("I am Exception Log Handler." + errorInfo.getformatedMessage());
		} else {
			System.out.println("I am Exception Log Handler.");
		}
	}
}
