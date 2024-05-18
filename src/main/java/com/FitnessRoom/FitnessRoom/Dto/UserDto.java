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
}
