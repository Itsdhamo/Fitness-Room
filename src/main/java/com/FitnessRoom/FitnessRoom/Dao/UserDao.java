package com.FitnessRoom.FitnessRoom.Dao;

import java.util.List;
import java.util.Optional;

import org.aspectj.apache.bcel.generic.RET;
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

	public List<UserDto> getAll() {
		
		return repo.findAll();
		
	}

	public UserDto FindById(int id) {
	  
		Optional<UserDto> GetUserById = repo.findById(id);
		
		if(GetUserById.isPresent())
		{
			return GetUserById.get();
		}
		
		return null;
	
	
	}

	public UserDto DelteUser(int id) {
		
		UserDto Delete = FindById(id);
		
		if(Delete!=null)
		{
		    repo.delete(Delete);
		    return Delete;
		}
		
		else {
			return null;
		}
		
	}

	public UserDto UpdateUser(UserDto user, int id) {
		
		UserDto Update = FindById(id);
		
		if(Update!=null)
		{
			Update.setId(id);
			
		   return repo.save(user);
		
		}
		
		else {
			
			return null;
		}
		
		
		
	}
	
	
	
}
