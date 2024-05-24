package com.FitnessRoom.FitnessRoom.Exception;

public class UserNotDelete extends RuntimeException
{
  String message;
  
  public String getMessage()
  {
	  return message;
  }
  
  public UserNotDelete(String message)
  {
	  this.message =message;
  }
}
