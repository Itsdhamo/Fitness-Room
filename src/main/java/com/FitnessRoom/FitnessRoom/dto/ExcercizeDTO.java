package com.FitnessRoom.FitnessRoom.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
public class ExcercizeDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int exid;
	private String exname;
	private int count;
	private double losingcalories;
	public int getExid() {
		return exid;
	}
	public void setExid(int exid) {
		this.exid = exid;
	}
	public String getExname() {
		return exname;
	}
	public void setExname(String exname) {
		this.exname = exname;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public double getLosingcalories() {
		return losingcalories;
	}
	public void setLosingcalories(double losingcalories) {
		this.losingcalories = losingcalories;
	}
	
}