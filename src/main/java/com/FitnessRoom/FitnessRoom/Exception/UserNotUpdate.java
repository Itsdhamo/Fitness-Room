package com.FitnessRoom.FitnessRoom.Exception;

public class UserNotUpdate extends RuntimeException 
{
   String message;
   
   public String getMessage()
   {
	   return message;
   }
   
   public UserNotUpdate(String message)
   {
	   this.message =  message;
   }
   
}
