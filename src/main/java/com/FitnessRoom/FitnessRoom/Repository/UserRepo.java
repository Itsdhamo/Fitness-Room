package com.FitnessRoom.FitnessRoom.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.FitnessRoom.FitnessRoom.Dto.UserDto;

public interface UserRepo extends JpaRepository<UserDto,Integer>
{

}
