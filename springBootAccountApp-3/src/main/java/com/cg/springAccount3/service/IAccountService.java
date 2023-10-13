package com.cg.springAccount3.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.springAccount3.entity.Account;
import com.cg.springAccount3.entity.Verification;
import com.cg.springAccount3.exceptions.InvalidBalanceException;


@Service
public interface IAccountService {

	public int saveAccount(Account a) throws InvalidBalanceException;
	public Account getAccountById(int searchId);
	public List<Account>getAllAccount();
	
    public List<Account> getAccountByLocation(String location);
	
	public Account updateAccount(int id,int balance);
	
    public String addVerificationDetails(int searchId,Verification verification);
	
	public Account addInsuranceToAccount(int searchId,int insurancecode);
	
	public Account addCardNumberToAccount(int searchId,long cardNum);


}
