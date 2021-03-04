package com.sparkexception.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface HandleException {
	static final String DEFAULT_HANDLER = "defaultExceptionHandler";
	public Class<?> exceptionType() default Exception.class;
	public String[] handlers() default { DEFAULT_HANDLER };
}
