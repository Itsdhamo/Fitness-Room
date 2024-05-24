package com.FitnessRoom.FitnessRoom.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.FitnessRoom.FitnessRoom.dao.WorkOutPlanDao;
import com.FitnessRoom.FitnessRoom.dto.WorkOutPlanDTO;
import com.FitnessRoom.FitnessRoom.util.ResponseStructure;

public class WorkOutPlanService {

	@Autowired
	WorkOutPlanDao dao;

	public ResponseEntity<ResponseStructure<WorkOutPlanDTO>> saveWorkOutPlan(WorkOutPlanDTO wop) {
		ResponseStructure<WorkOutPlanDTO> structure = new ResponseStructure<WorkOutPlanDTO>();
		WorkOutPlanDTO savedwop = dao.saveWorkOutPlan(wop);
		if (savedwop != null) {
			structure.setData(savedwop);
			structure.setMessage("WorkOutPlan saved sucessfully...");
			structure.setStatus(HttpStatus.CREATED.value());
			return new ResponseEntity<ResponseStructure<WorkOutPlanDTO>>(structure, HttpStatus.CREATED);
		}
		return null;
	}

	public ResponseEntity<ResponseStructure<WorkOutPlanDTO>> findWorkOutPlan(int id) {
		ResponseStructure<WorkOutPlanDTO> structure = new ResponseStructure<WorkOutPlanDTO>();
		WorkOutPlanDTO findwop = dao.findID(id);
		if (findwop != null) {
			structure.setData(findwop);
			structure.setMessage("WorkOutPlan found with given ID...");
			structure.setStatus(HttpStatus.FOUND.value());
			return new ResponseEntity<ResponseStructure<WorkOutPlanDTO>>(structure, HttpStatus.FOUND);
		}
		return null;
	}

	public ResponseEntity<ResponseStructure<WorkOutPlanDTO>> deleteWorkOutPlan(int id){
		ResponseStructure<WorkOutPlanDTO> structure=new ResponseStructure<WorkOutPlanDTO>();
		WorkOutPlanDTO deletewop=dao.findID(id);
		if(deletewop != null) {
			structure.setData(dao.deleteWorkOutPlan(id));
			structure.setMessage("WorkOutPlan deleted sucessfully...");
			structure.setStatus(HttpStatus.OK.value());
			return new ResponseEntity<ResponseStructure<WorkOutPlanDTO>>(structure,HttpStatus.OK);
		}
		return  null;
	}
	
	public ResponseEntity<ResponseStructure<WorkOutPlanDTO>> updateWorkOutPlan(WorkOutPlanDTO wop,int id){
		ResponseStructure<WorkOutPlanDTO> structure=new ResponseStructure<WorkOutPlanDTO>();
		WorkOutPlanDTO updatewop=dao.findID(id);
		if(updatewop!=null) {
			structure.setData(dao.updateWorkOutPlan(updatewop, id));
			structure.setMessage("WorkOutPlan Updated Sucessfully...");
			structure.setStatus(HttpStatus.OK.value());
			return new ResponseEntity<ResponseStructure<WorkOutPlanDTO>>(structure,HttpStatus.OK);
		}
		return null;
	}
	
	public ResponseEntity<ResponseStructure<List<WorkOutPlanDTO>>> findall(){
		ResponseStructure<List<WorkOutPlanDTO>> structure=new ResponseStructure<List<WorkOutPlanDTO>>();
		structure.setData(dao.findall());
		structure.setMessage("Found WorkOutPlan details...");
		structure.setStatus(HttpStatus.FOUND.value());
		return new ResponseEntity<ResponseStructure<List<WorkOutPlanDTO>>>(structure,HttpStatus.FOUND);
	}
}
