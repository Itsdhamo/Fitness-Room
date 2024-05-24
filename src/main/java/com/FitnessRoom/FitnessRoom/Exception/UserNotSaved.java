package com.FitnessRoom.FitnessRoom.Exception;

public class UserNotSaved extends RuntimeException
{
   String message;
   
   public String getMessage() 
   {
		return message;
	}

public UserNotSaved(String message)
{
	this.message = message;
}

         
   
}
