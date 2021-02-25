package com.sparkexception.services;

import org.springframework.stereotype.Component;

import com.sparkexception.exceptions.CustomException;
import com.sparkexception.models.ErrorInfo;

@Component
public class ExceptionHandler {
	public void handleException(CustomException customException) {
		ErrorInfo errorInfo = generateErrorInfo(customException);
		publishErrorMessage(errorInfo);
	}

	private void publishErrorMessage(ErrorInfo errorInfo) {
		// TODO write code to convert JSON and writing

	}

	private ErrorInfo generateErrorInfo(CustomException customException) {
		ErrorInfo errorInfo = new ErrorInfo();
		// errorInfo.setAppName(appName);
		errorInfo.setErrorCode(customException.getErrorCode());
		errorInfo.setErrorDescription(customException.getErrorMessage());
		return errorInfo;
	}
}
