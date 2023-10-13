package com.cg.springAccount3.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "My_Insurance")
public class Insurance {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int insuranceCode;
	@Column(unique = true)
	private String insuranceName;
	private int sumAssuredAmount;

}
