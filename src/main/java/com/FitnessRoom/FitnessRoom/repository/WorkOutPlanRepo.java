package com.FitnessRoom.FitnessRoom.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.FitnessRoom.FitnessRoom.dto.WorkOutPlanDTO;

public interface WorkOutPlanRepo extends JpaRepository<WorkOutPlanDTO,Integer>{

}
