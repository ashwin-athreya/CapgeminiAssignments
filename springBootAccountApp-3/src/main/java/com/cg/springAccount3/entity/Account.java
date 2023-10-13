package com.cg.springAccount3.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


import org.springframework.validation.annotation.Validated;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "yyyaaccount")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Validated
public class Account {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Min(value = 500 , message = "Balance cannot be less than 500")
	private int balance;
	@Size(min = 3, max = 50, message = "Input location is not valid")
	private String location;
	private int mobilePin;
	@NotNull
	private String accountType;
	
	
	@Embedded
	@Column(nullable = true)
	private Verification accVerification;
	
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "PolicyIssued")
	private Insurance insurance;
	
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "debitCardNum")
	private DebitCard debitCard;
	
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "transAccId")
	private List<Transaction> allTransaction;
	
	public Account(int balance, String location, int mobilePin, String accountType) {
		super();
		this.balance = balance;
		this.location = location;
		this.mobilePin = mobilePin;
		this.accountType = accountType;
	}
	
	

}
