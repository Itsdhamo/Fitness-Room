package com.FitnessRoom.FitnessRoom.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.FitnessRoom.FitnessRoom.Dto.UserDto;
import com.FitnessRoom.FitnessRoom.Util.ResponseStructure;


@RestControllerAdvice
public class ExceptionHandling 
{
	
	@ExceptionHandler
   public ResponseEntity<ResponseStructure<String>> UserNotFound(UserNotFound ex) 
   {
	  ResponseStructure<String> structure =new ResponseStructure<String>();
	  structure.setData(ex.getMessage());
	  structure.setMessage("User Not Found With Given Id");
	  structure.setStatus(HttpStatus.NOT_FOUND.value());
	  
	  return new ResponseEntity<ResponseStructure<String>>(structure,HttpStatus.NOT_FOUND);
	 
    }
	
	@ExceptionHandler
	public ResponseEntity<ResponseStructure<String>> UserNotSaved(UserNotSaved ex)
     {
		ResponseStructure<String> structure =new ResponseStructure<String>();
		  structure.setData(ex.getMessage());
		  structure.setMessage("User Not Saved");
		  structure.setStatus(HttpStatus.NOT_ACCEPTABLE.value());
		  
		  return new ResponseEntity<ResponseStructure<String>>(structure,HttpStatus.NOT_ACCEPTABLE);
		 

     }
	
	
	
	
	@ExceptionHandler
	public ResponseEntity<ResponseStructure<String>> UserNotDelete(UserNotDelete ex)
     {
		ResponseStructure<String> structure =new ResponseStructure<String>();
		  structure.setData(ex.getMessage());
		  structure.setMessage("User Not Delete");
		  structure.setStatus(HttpStatus.NOT_EXTENDED.value());
		  
		  return new ResponseEntity<ResponseStructure<String>>(structure,HttpStatus.NOT_EXTENDED);
		 

     }

	
	@ExceptionHandler
	public ResponseEntity<ResponseStructure<String>> UserNotUpdate(UserNotUpdate ex)
     {
		ResponseStructure<String> structure =new ResponseStructure<String>();
		  structure.setData(ex.getMessage());
		  structure.setMessage("User Not Update");
		  structure.setStatus(HttpStatus.NOT_MODIFIED.value());
		  
		  return new ResponseEntity<ResponseStructure<String>>(structure,HttpStatus.NOT_MODIFIED);
		 

     }
	

	


}
