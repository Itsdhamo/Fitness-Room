package com.FitnessRoom.FitnessRoom.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.FitnessRoom.FitnessRoom.Dto.UserDto;
import com.FitnessRoom.FitnessRoom.Service.UserService;
import com.FitnessRoom.FitnessRoom.Util.ResponseStructure;

@RestController
@RequestMapping("/FitnessRoom")
public class UserController 
{
	
	@Autowired
	 private UserService service;
	
	@PostMapping("/create-new-user")
	public ResponseEntity<ResponseStructure<UserDto>> SaveUser(@RequestBody UserDto user)
	{
	   return service.SaveUser(user);	
	
	}
	
	
	@GetMapping("/get-all-user")
	public ResponseEntity<ResponseStructure<List<UserDto>>> GetAllUser()
	{
		return service.GetAllUser();
	}
	
	
	@GetMapping("/find-user-by-id")
	public ResponseEntity<ResponseStructure<UserDto>> GetUserFindById(@RequestParam int id)
	{
		return service.GetUserFindById(id);
	}
	
	
	@DeleteMapping("/user-delete")
	public ResponseEntity<ResponseStructure<UserDto>> DeleteUser(@RequestParam int id)
	{
	   return service.DeleteUser(id);	
	}
	
	
	@PutMapping("/user-update")
	public ResponseEntity<ResponseStructure<UserDto>> UpdateUser(@RequestBody UserDto user,@RequestParam int id)
	{
		return service.UpdateUser(user,id);
	}

}
