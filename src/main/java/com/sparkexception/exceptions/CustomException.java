package com.sparkexception.exceptions;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomException extends Exception {
	private static final long serialVersionUID = 1L;
	private final String errorCode;
	private final String errorMessage;

	public CustomException(String errorCode, String errorMessage) {
		super(errorMessage);
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
	}
}
