package com.FitnessRoom.FitnessRoom.Dto;

import java.util.List;

import org.springframework.stereotype.Component;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Entity
@Component
@Setter
@Getter
public class TrainersDto
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
   private int id;

   private String name;
   private String email;
   private String password;
   private long contect;
   
   
   @ManyToOne(cascade = CascadeType.ALL)
   	private UserDto user;
   
   
   @OneToMany(cascade = CascadeType.ALL)
   private List<SlotDto> slot;
   	
    
   
}
