package com.FitnessRoom.FitnessRoom.Dto;

import java.util.List;

import org.springframework.stereotype.Component;

import jakarta.persistence.CascadeType;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Component
@Setter
@Getter
public class UserDto
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
   private int id;
   private String name;
   private String email;
   private String password;
   private long contect;
   
   @OneToOne(cascade = CascadeType.ALL)
   private TrainersDto trainers;
   
   
   @OneToOne(cascade = CascadeType.ALL)
   private SlotDto slot;
   
   
   @ElementCollection
   private List<ChalengesDto> chalenges;


public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public String getEmail() {
	return email;
}


public void setEmail(String email) {
	this.email = email;
}


public String getPassword() {
	return password;
}


public void setPassword(String password) {
	this.password = password;
}


public long getContect() {
	return contect;
}


public void setContect(long contect) {
	this.contect = contect;
}


public TrainersDto getTrainers() {
	return trainers;
}


public void setTrainers(TrainersDto trainers) {
	this.trainers = trainers;
}


public SlotDto getSlot() {
	return slot;
}


public void setSlot(SlotDto slot) {
	this.slot = slot;
}


public List<ChalengesDto> getChalenges() {
	return chalenges;
}


public void setChalenges(List<ChalengesDto> chalenges) {
	this.chalenges = chalenges;
}
   
   
   
   
   
}
