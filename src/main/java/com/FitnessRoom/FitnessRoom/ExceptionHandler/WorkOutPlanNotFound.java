package com.FitnessRoom.FitnessRoom.ExceptionHandler;

public class WorkOutPlanNotFound extends RuntimeException{

	String message;
	
	public String getMessage() {
		return message;
	}

  public WorkOutPlanNotFound(String message) {
		this.message = message;
	}
}
