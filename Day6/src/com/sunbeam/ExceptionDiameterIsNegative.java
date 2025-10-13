package com.sunbeam;

public class ExceptionDiameterIsNegative extends Throwable {

	private String message;
	
	public ExceptionDiameterIsNegative() {
		// TODO Auto-generated constructor stub
	}

	public ExceptionDiameterIsNegative(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
