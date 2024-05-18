package com.FitnessRoom.FitnessRoom.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.FitnessRoom.FitnessRoom.Dao.UserDao;
import com.FitnessRoom.FitnessRoom.Dto.UserDto;
import com.FitnessRoom.FitnessRoom.Util.ResponseStructure;

@Service
public class UserService 
{
	@Autowired
   UserDao dao;
	
	
	
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
		
		return null;
	}
}
