package com.FitnessRoom.FitnessRoom.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.FitnessRoom.FitnessRoom.dto.ExcercizeDTO;
import com.FitnessRoom.FitnessRoom.repository.ExcercizeRepo;

public class ExcercizeDao {
	
	@Autowired
ExcercizeRepo repo;
	
	public ExcercizeDTO saveExcercize(ExcercizeDTO exc) {
		return repo.save(exc);
	}
	
	public ExcercizeDTO findyID(int id) {
		Optional<ExcercizeDTO> opexc=repo.findById(id);
		if(opexc.isPresent()) {
			return opexc.get();
		}
		else {
			return null;
		}
	}
	public ExcercizeDTO deleteExcercize(int id) {
		ExcercizeDTO exc=findyID(id);
		if(exc!=null) {
			repo.delete(exc);
			return exc;
		}
		else {
			return null;
		}
	}
	
	public ExcercizeDTO updateExcercize(ExcercizeDTO exc,int id) {
		ExcercizeDTO exexc=findyID(id);
		if(exexc!=null) {
			exc.setExid(id);
			return repo.save(exc);
		}
		else {
			return null;
		}
	}
	
	public List<ExcercizeDTO> findall(){
		return repo.findAll();
	}
}
