package com.FitnessRoom.FitnessRoom.ExceptionHandler;

import java.util.HashMap;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.FitnessRoom.FitnessRoom.util.ResponseStructure;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.ConstraintViolationException;

@RestControllerAdvice
public class ExceptionHandler {
	
	@org.springframework.web.bind.annotation.ExceptionHandler
	public ResponseEntity<ResponseStructure<String>> excercizeNotFound(ExcercizeNotFound ex){
		ResponseStructure<String> structure=new ResponseStructure<String>();
		structure.setMessage("Excercize Not Present With the Given Id...");
		structure.setStatus(HttpStatus.NOT_FOUND.value());
		structure.setData(ex.getMessage());
		
		return new ResponseEntity<ResponseStructure<String>>(structure,HttpStatus.NOT_FOUND);
	}
	
	@org.springframework.web.bind.annotation.ExceptionHandler
	public ResponseEntity<ResponseStructure<String>> workoutplanNOtFound(WorkOutPlanNotFound ex){
		ResponseStructure<String> structure =new ResponseStructure<String>();
		structure.setMessage("WorkOutPlan Not Present With Given ID...");
		structure.setStatus(HttpStatus.NOT_FOUND.value());
		structure.setData(ex.getMessage());
		
		return new ResponseEntity<ResponseStructure<String>>(structure,HttpStatus.NOT_FOUND);
	}
	
	protected ResponseEntity<Object> handleConstraintViolation(ConstraintViolationException ex){
		ResponseStructure<Object> structure =new ResponseStructure<Object>();
		Map<String , String> hash=new HashMap<String, String>();
		
		for(ConstraintViolation<?> violation: ex.getConstraintViolations()) {
			String field=violation.getPropertyPath().toString();
			String message=violation.getMessage();
			hash.put(field, message);
		}
		structure.setMessage("ADD PROPER DETAILS...");
		structure.setData(hash);
		structure.setStatus(HttpStatus.FORBIDDEN.value());
		
		return new ResponseEntity<Object>(structure,HttpStatus.FORBIDDEN);
		
	}
}
