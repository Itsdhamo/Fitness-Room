package com.FitnessRoom.FitnessRoom.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.FitnessRoom.FitnessRoom.dto.WorkOutPlanDTO;
import com.FitnessRoom.FitnessRoom.service.WorkOutPlanService;
import com.FitnessRoom.FitnessRoom.util.ResponseStructure;

public class WorkOutPlanController {

	@Autowired
	WorkOutPlanService service;
	
	@PostMapping
	public ResponseEntity<ResponseStructure<WorkOutPlanDTO>> saveWorkOutPlan(@RequestBody WorkOutPlanDTO wop){
		return service.saveWorkOutPlan(wop);
	}
	
	@GetMapping
	public ResponseEntity<ResponseStructure<WorkOutPlanDTO>> findWorkOutPlan(@RequestParam int id){
		return service.findWorkOutPlan(id);
	}
	
	@DeleteMapping
	public ResponseEntity<ResponseStructure<WorkOutPlanDTO>> deleteWorkOutPlan(@RequestParam int id){
		return service.deleteWorkOutPlan(id);
	}
	
	@PutMapping
	public ResponseEntity<ResponseStructure<WorkOutPlanDTO>> updateWorkOutPlan(@RequestBody WorkOutPlanDTO wop,@RequestParam int id){
		return service.updateWorkOutPlan(wop, id);
	}
	
	@GetMapping("findall")
	public ResponseEntity<ResponseStructure<List<WorkOutPlanDTO>>> findWorkOutPlan(){
		return service.findall();
	}
	
}
