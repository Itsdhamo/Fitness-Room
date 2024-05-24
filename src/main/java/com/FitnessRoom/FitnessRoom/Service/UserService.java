package com.FitnessRoom.FitnessRoom.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.FitnessRoom.FitnessRoom.Dao.UserDao;
import com.FitnessRoom.FitnessRoom.Dto.UserDto;
import com.FitnessRoom.FitnessRoom.Exception.UserNotDelete;
import com.FitnessRoom.FitnessRoom.Exception.UserNotFound;
import com.FitnessRoom.FitnessRoom.Exception.UserNotSaved;
import com.FitnessRoom.FitnessRoom.Exception.UserNotUpdate;
import com.FitnessRoom.FitnessRoom.Util.ResponseStructure;

@Service
public class UserService 
{
	@Autowired
       private UserDao dao;
	
	
	
	public ResponseEntity<ResponseStructure<UserDto>> SaveUser(UserDto user)
	{
		ResponseStructure<UserDto> structure = new ResponseStructure<UserDto>();
		
		UserDto SaveUser = dao.saveuser(user);
		
		if(SaveUser!=null)
		{
			structure.setData(SaveUser);
			structure.setMessage("User saved SucessFully");
			structure.setStatus(HttpStatus.CREATED.value());
			return new ResponseEntity<ResponseStructure<UserDto>>(structure,HttpStatus.CREATED);
		}
		
     else {
 		throw new UserNotSaved("User Not Saved");

	}
	
	}



	public ResponseEntity<ResponseStructure<List<UserDto>>> GetAllUser() {
		
	   ResponseStructure<List<UserDto>> structure =new ResponseStructure<List<UserDto>>();
	   
	   structure.setData(dao.getAll());
	   structure.setMessage("Get All User");
	   structure.setStatus(HttpStatus.FOUND.value());
	   
	   return new ResponseEntity<ResponseStructure<List<UserDto>>>(structure,HttpStatus.FOUND);
 	
	}



	public ResponseEntity<ResponseStructure<UserDto>> GetUserFindById(int id) {
		
		ResponseStructure<UserDto> structure  =new  ResponseStructure<UserDto>();
		
		UserDto GetUserId = dao.FindById(id);
		
		if(GetUserId!=null)
		{
			structure.setData(GetUserId);
			structure.setMessage("User Given Id Fond");
			structure.setStatus(HttpStatus.FOUND.value());
			return new ResponseEntity<ResponseStructure<UserDto>>(structure,HttpStatus.FOUND);
		}
		
		else {
			throw new UserNotFound("User Not Found With Given Id");

		}

		
	}



	public ResponseEntity<ResponseStructure<UserDto>> DeleteUser(int id) {
		
		ResponseStructure<UserDto> structure  = new ResponseStructure<UserDto>();
		
		UserDto Delete =  dao.FindById(id);
		
		if(Delete!=null)
		{
			structure.setData(dao.DelteUser(id));
			structure.setMessage("User Successfully Delete");
			structure.setStatus(HttpStatus.OK.value());
			return new ResponseEntity<ResponseStructure<UserDto>>(structure,HttpStatus.OK);
		}
		
		else {
			throw new UserNotDelete("User Not Delete");

		}		
		
	}



	public ResponseEntity<ResponseStructure<UserDto>> UpdateUser(UserDto user, int id) {
		
	   ResponseStructure<UserDto>  structure = new ResponseStructure<UserDto>();
	   
	   UserDto updateuser = dao.UpdateUser(user,id);
	   
	   if(updateuser!=null)
	   {
		   structure.setData(updateuser);
		   structure.setMessage("User Updated With Given Id Successfully");
		   structure.setStatus(HttpStatus.OK.value());
		   
		   return new ResponseEntity<ResponseStructure<UserDto>>(structure,HttpStatus.OK);
	   }
	   
	   else {
		throw new UserNotUpdate("User Not Update");
	}
	
	
	}



	}
