package com.sparkexception.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ErrorInfo {
	private String appName;
	private String errorCode;
	private String errorDescription;

	public String getformatedMessage() {
		return this.appName + " " + this.getErrorCode() + "-" + "-" + this.getErrorDescription();
	}
}
