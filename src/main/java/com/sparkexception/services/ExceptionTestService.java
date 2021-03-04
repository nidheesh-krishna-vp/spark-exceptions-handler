package com.sparkexception.services;

import org.springframework.stereotype.Service;

import com.sparkexception.annotation.HandleException;
import com.sparkexception.annotation.HandleExceptions;
import com.sparkexception.exceptions.FileNotExistException;
import com.sparkexception.models.ErrorInfo;

/**
 * 
 * @author 165253
 *
 */
@Service
public class ExceptionTestService {
	@HandleExceptions({ @HandleException(exceptionType = FileNotExistException.class, handlers = {
			"defaultExceptionHandler", "logExceptionHandler" }) })
	public Integer testExceptionOne(int type) {
		if (type == 0) {
			ErrorInfo errorDetail = new ErrorInfo("AppName", "ErrorCode123", "File could not find");
			throw new FileNotExistException(errorDetail);
		} else {
			throw new RuntimeException("General Runtime  Exception");
		}
	}

	@HandleException(handlers = { "fileExceptionHandler", "defaultExceptionHandler", "logExceptionHandler" })
	public void testExceptionTwo() {
		throw new RuntimeException("IO Exception");
	}
}
