package com.cg.springAccount3.util;

import org.springframework.stereotype.Component;

import com.cg.springAccount3.dto.AccountRequestSubmitDTO;
import com.cg.springAccount3.entity.Account;
import com.cg.springAccount3.entity.Verification;

@Component
public class AccountDTOConvertor {
	
	public Account getAccountFromAccountDTO(AccountRequestSubmitDTO dto)
	{
		Account a = new Account();
		
		a.setId(dto.getPin());
		a.setLocation(dto.getLocation());
		a.setBalance(dto.getBalance());
		a.setAccountType(dto.getType());
		
		Verification kyc = new Verification(dto.getPan(), true);
		a.setAccVerification(kyc);
		
		return a;
	}

}
