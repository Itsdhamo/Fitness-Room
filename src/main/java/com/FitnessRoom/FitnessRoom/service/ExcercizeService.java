package com.FitnessRoom.FitnessRoom.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.FitnessRoom.FitnessRoom.dao.ExcercizeDao;
import com.FitnessRoom.FitnessRoom.dto.ExcercizeDTO;
import com.FitnessRoom.FitnessRoom.util.ResponseStructure;

@Service
public class ExcercizeService {

	@Autowired
	ExcercizeDao dao;
	
	public ResponseEntity<ResponseStructure<ExcercizeDTO>> saveExcercize(ExcercizeDTO exc){
		ResponseStructure<ExcercizeDTO> structure=new ResponseStructure<ExcercizeDTO>();
		ExcercizeDTO savedexc=dao.saveExcercize(exc);
		if(savedexc != null) {
			structure.setData(savedexc);
			structure.setMessage("Excercize saved sucessfully...");
			structure.setStatus(HttpStatus.CREATED.value());
			return new ResponseEntity<ResponseStructure<ExcercizeDTO>>(structure,HttpStatus.CREATED);
		}
		return null;
	}
	
	public ResponseEntity<ResponseStructure<ExcercizeDTO>> findExcercize(int id){
		ResponseStructure<ExcercizeDTO> structure=new ResponseStructure<ExcercizeDTO>();
		ExcercizeDTO findexc=dao.findyID(id);
		if(findexc !=null) {
			structure.setData(findexc);
			structure.setMessage("Excercize found with the given id...");
			structure.setStatus(HttpStatus.FOUND.value());
			return new ResponseEntity<ResponseStructure<ExcercizeDTO>>(structure,HttpStatus.FOUND);
		}
		return null;
	}
	
	public ResponseEntity<ResponseStructure<ExcercizeDTO>> deleteExcercize(int id){
		ResponseStructure<ExcercizeDTO> structure=new ResponseStructure<ExcercizeDTO>();
         ExcercizeDTO deleteexc=dao.findyID(id);
         if(deleteexc !=null) {
        	 structure.setData(dao.deleteExcercize(id));
        	 structure.setMessage("Excercize deleted sucessfully...");
        	 structure.setStatus(HttpStatus.OK.value());
        	 return new ResponseEntity<ResponseStructure<ExcercizeDTO>>(structure,HttpStatus.OK);
         }
         return null;
	}
	
	public ResponseEntity<ResponseStructure<ExcercizeDTO>> updateExcercize(ExcercizeDTO exc,int id){
		ResponseStructure<ExcercizeDTO> structure=new ResponseStructure<ExcercizeDTO>();
        ExcercizeDTO updateexc=dao.findyID(id);
        if(updateexc !=null) {
        	structure.setData(dao.updateExcercize(updateexc, id));
        	structure.setMessage("Excercize updated sucessfully...");
        	structure.setStatus(HttpStatus.OK.value());
        	return new ResponseEntity<ResponseStructure<ExcercizeDTO>>(structure,HttpStatus.OK);
        }
        return null;
	}
	
	public ResponseEntity<ResponseStructure<List<ExcercizeDTO>>> findall(){
		ResponseStructure<List<ExcercizeDTO>> structure=new ResponseStructure<List<ExcercizeDTO>>();
        structure.setData(dao.findall());
        structure.setMessage("Found excercize details...");
        structure.setStatus(HttpStatus.FOUND.value());
        return new ResponseEntity<ResponseStructure<List<ExcercizeDTO>>>(structure,HttpStatus.FOUND);
}
}
