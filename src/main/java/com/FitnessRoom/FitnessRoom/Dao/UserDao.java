package com.FitnessRoom.FitnessRoom.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.FitnessRoom.FitnessRoom.Dto.UserDto;
import com.FitnessRoom.FitnessRoom.Repository.UserRepo;

@Repository
public class UserDao 
{
	
	@Autowired
   UserRepo repo;
	
	public UserDto saveuser(UserDto user)
	{
		return repo.save(user);
	}
}
