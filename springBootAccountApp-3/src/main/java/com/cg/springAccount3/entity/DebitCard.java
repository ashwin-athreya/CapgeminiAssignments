package com.cg.springAccount3.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Value;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DebitCard {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long cardNumber;
	@Value("1234")
	private int pin;
	private String expiryDate;
	private boolean cardStatus;
	private boolean isBlocked;
	
	public DebitCard(int pin, String expiryDate, boolean cardStatus, boolean isBlocked) {
		super();
		this.pin = pin;
		this.expiryDate = expiryDate;
		this.cardStatus = cardStatus;
		this.isBlocked = isBlocked;
	}

	
	
	


}
