package com.FitnessRoom.FitnessRoom.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.FitnessRoom.FitnessRoom.dto.ExcercizeDTO;
import com.FitnessRoom.FitnessRoom.service.ExcercizeService;
import com.FitnessRoom.FitnessRoom.util.ResponseStructure;

@RestController
@RequestMapping("excercize")
public class ExcercizeController {
 
	@Autowired
	ExcercizeService service;
	
	@PostMapping
	public ResponseEntity<ResponseStructure<ExcercizeDTO>> saveExcercize(@RequestBody ExcercizeDTO exc){
		return service.saveExcercize(exc);
	}
	
	@GetMapping
	public ResponseEntity<ResponseStructure<ExcercizeDTO>> findExcercize(@RequestParam int id){
		return service.findExcercize(id);
	}
	
	@DeleteMapping
	public ResponseEntity<ResponseStructure<ExcercizeDTO>> deleteExcercize(@RequestParam int id){
		return service.deleteExcercize(id);
	}
	
	@PutMapping
	public ResponseEntity<ResponseStructure<ExcercizeDTO>> updateExcercize(@RequestBody ExcercizeDTO exc,@RequestParam int id){
		return service.updateExcercize(exc, id);
	}
	
	@GetMapping("findall")
	public ResponseEntity<ResponseStructure<List<ExcercizeDTO>>> findExcercize(){
		return service.findall();
	}
}
