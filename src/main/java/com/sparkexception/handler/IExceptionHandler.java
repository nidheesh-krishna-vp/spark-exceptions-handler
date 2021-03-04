package com.sparkexception.handler;

public interface IExceptionHandler<T> {
	public void handleException(final T baseException);
}
