package com.FitnessRoom.FitnessRoom.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.FitnessRoom.FitnessRoom.dto.ExcercizeDTO;

public interface ExcercizeRepo extends JpaRepository<ExcercizeDTO,Integer>{

}
