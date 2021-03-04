package com.sparkexception.exceptions;

import com.sparkexception.models.ErrorInfo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BaseException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	private ErrorInfo errorInfo;

	public BaseException(String message) {
		super(message);
	}

	public BaseException(Exception rexp) {
		super(rexp);
	}

	public BaseException(ErrorInfo errorInfo) {
		this.errorInfo = errorInfo;
	}
}
