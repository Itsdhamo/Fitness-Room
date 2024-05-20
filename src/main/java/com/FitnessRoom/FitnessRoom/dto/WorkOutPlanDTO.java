package com.FitnessRoom.FitnessRoom.dto;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jakarta.persistence.CascadeType;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Data;

@Entity
@Component
public class WorkOutPlanDTO {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
 private int wopid;
 private String wopname;
 @ElementCollection
 private Map<String,Double> caloriesburnt;
 @ManyToMany(cascade = CascadeType.ALL)
 private List<ExcercizeDTO> listofexcercize;
public int getWopid() {
	return wopid;
}
public void setWopid(int wopid) {
	this.wopid = wopid;
}
public String getWopname() {
	return wopname;
}
public void setWopname(String wopname) {
	this.wopname = wopname;
}
public Map<String, Double> getCaloriesburnt() {
	return caloriesburnt;
}
public void setCaloriesburnt(Map<String, Double> caloriesburnt) {
	this.caloriesburnt = caloriesburnt;
}
public List<ExcercizeDTO> getListofexcercize() {
	return listofexcercize;
}
public void setListofexcercize(List<ExcercizeDTO> listofexcercize) {
	this.listofexcercize = listofexcercize;
}
 
}
