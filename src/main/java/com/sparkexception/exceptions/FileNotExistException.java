package com.sparkexception.exceptions;

import com.sparkexception.annotation.Handlers;
import com.sparkexception.models.ErrorInfo;

@Handlers({ "fileExceptionHandler" })
public class FileNotExistException extends BaseException {

	private static final long serialVersionUID = 1L;

	public FileNotExistException(RuntimeException e) {
		super(e);
	}

	public FileNotExistException(String msg) {
		super(msg);
	}

	public FileNotExistException(ErrorInfo errorDetail) {
		super(errorDetail);
	}
}
