package com.cg.springAccount3.entity;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "My_transaction")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Transaction {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(insertable = false, updatable = false)
	private int transactionId;
	@Column(nullable = false)
	private String transactionDate;
	private int amount;
	
	public Transaction(String transactionDate, int amount) {
		super();
		this.transactionDate = transactionDate;
		this.amount = amount;
	}
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "transAccId")
	private Account account;
}
