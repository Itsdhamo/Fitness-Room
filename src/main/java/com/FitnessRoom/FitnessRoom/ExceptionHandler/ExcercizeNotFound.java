package com.FitnessRoom.FitnessRoom.ExceptionHandler;

public class ExcercizeNotFound extends RuntimeException{

	String message;
	
	public String getMessage() {
		return message;
	}

	public ExcercizeNotFound(String message) {
		this.message = message;
	}
}
