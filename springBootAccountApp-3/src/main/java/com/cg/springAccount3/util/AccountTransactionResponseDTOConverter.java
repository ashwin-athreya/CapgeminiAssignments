package com.cg.springAccount3.util;

import org.springframework.stereotype.Component;

import com.cg.springAccount3.dto.AccountTransactionResponseDTO;
import com.cg.springAccount3.entity.Transaction;

@Component
public class AccountTransactionResponseDTOConverter {
	
	public AccountTransactionResponseDTO getAccountDTO(Transaction t)
	{
		AccountTransactionResponseDTO dto = new AccountTransactionResponseDTO();
		
		dto.setLocation(t.getAccount().getLocation());
		dto.setBalance(t.getAccount().getBalance());
		dto.setType(t.getAccount().getAccountType());
		dto.setTransactionDate(t.getTransactionDate());
		dto.setAmount(t.getAmount());
		
		return dto;
	}

}
