package com.example.demo.model;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
//if we will not use @AllArgConstructor then lombok will use default constructor 
//@AllArgsConstructor
@AllArgsConstructor
@NoArgsConstructor
public class Admin {
	@Id
	private String Aname;
	private String Apwd;



}
