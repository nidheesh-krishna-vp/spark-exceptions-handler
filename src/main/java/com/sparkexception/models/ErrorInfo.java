package com.sparkexception.models;

import lombok.Data;

@Data
public class ErrorInfo {
	private String appName;
	private String errorCode;
	private String errorDescription;
}
