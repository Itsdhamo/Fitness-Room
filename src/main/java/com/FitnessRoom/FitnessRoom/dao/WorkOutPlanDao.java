package com.FitnessRoom.FitnessRoom.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.FitnessRoom.FitnessRoom.dto.WorkOutPlanDTO;
import com.FitnessRoom.FitnessRoom.repository.WorkOutPlanRepo;

public class WorkOutPlanDao {

	@Autowired
	WorkOutPlanRepo repo;
	
	public WorkOutPlanDTO saveWorkOutPlan(WorkOutPlanDTO wop) {
		return repo.save(wop);
	}
	
	public WorkOutPlanDTO findID(int id) {
		Optional<WorkOutPlanDTO> opwop=repo.findById(id);
		if(opwop.isPresent()) {
			return opwop.get();
		}
		else {
			return null;
		}
	}
	
	public WorkOutPlanDTO deleteWorkOutPlan(int id) {
		WorkOutPlanDTO wop=findID(id);
		if(wop !=null) {
			repo.delete(wop);
			return wop;
		}
		else {
			return null;
		}
	}
	
	public WorkOutPlanDTO updateWorkOutPlan(WorkOutPlanDTO wop,int id) {
		WorkOutPlanDTO exwop=findID(id);
		if(exwop !=null) {
			wop.setWopid(id);
			return repo.save(wop);
		}
		else {
			return null;
		}
	}
	
	public List<WorkOutPlanDTO> findall(){
		return repo.findAll();
	}
}
