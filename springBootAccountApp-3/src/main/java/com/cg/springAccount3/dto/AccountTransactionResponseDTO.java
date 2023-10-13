package com.cg.springAccount3.dto;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AccountTransactionResponseDTO {
	
	private String location;
	private int balance;
	private String type;
	private String transactionDate;
	private int amount;

}
