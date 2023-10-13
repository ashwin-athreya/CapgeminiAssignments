package com.cg.springAccount3.service;

import java.util.List;
//import java.util.Random;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.cg.springAccount3.repository.IAccountRepository;
import com.cg.springAccount3.repository.IDebitCardRepository;
import com.cg.springAccount3.repository.IInsuranceRepository;
import com.cg.springAccount3.entity.Account;
import com.cg.springAccount3.entity.DebitCard;
import com.cg.springAccount3.entity.Insurance;
import com.cg.springAccount3.entity.Verification;
import com.cg.springAccount3.exceptions.InvalidBalanceException;

@Service
public class AccountServiceImple implements IAccountService {
	@Autowired
	IAccountRepository accRepository;
	
	@Autowired
	IAccountRepository empRepository;
	
	@Autowired
	IInsuranceRepository insuranceRepository;
	
	@Autowired
	IDebitCardRepository debitCardRepository;
	
	
	public AccountServiceImple() {
		System.out.println("inside implementation class");
	}

	@Override
	@Transactional
	public int saveAccount(Account a) throws InvalidBalanceException {
		
		 if(a == null)throw new NullPointerException("a is null");
		 else if(a!=null)
	     {
			   if(a.getBalance() <= 0)
			   {
				   System.err.println("Inside checking balance");
				   throw new InvalidBalanceException("Invalid balance found", AccountServiceImple.class+"");		
				   }
		   }
		   Account savedAccount = accRepository.save(a);

		   if(savedAccount != null)
		   {
			   return savedAccount.getId();
		   }
		   return 0;
	}

	@Override
	public Account getAccountById(int searchId) {
		Account savedAccount = accRepository.getReferenceById(searchId);
		 if(savedAccount !=null)
			{
				return savedAccount;
			}
			else return null;
	}

	@Override
	public List<Account> getAllAccount() {
		List<Account> allSavedAccounts =  accRepository.findAll();
		if(allSavedAccounts != null || allSavedAccounts.size() != 0)
		{
			return allSavedAccounts;
		}
		else return null;
	}
	
	

	@Override
	@Transactional
	public String addVerificationDetails(int searchId, Verification verification) {
		Account savedAcc = getAccountById(searchId);
		if(savedAcc != null)
		{
			savedAcc.setAccVerification(verification);// will call update query in DB
			return "Verifcation Added "+savedAcc.getAccVerification().isStatus();
		}
		else return "Verification Error "+savedAcc;
	}
	
	
	@Override
	@Transactional
	public Account addInsuranceToAccount(int searchId, int insuranceCode) {
		Account savedAcc = getAccountById(searchId); // fetch employee from table 
		Insurance insurance = insuranceRepository.findById(insuranceCode).get();  // fetch insurance from table
		
		if(savedAcc != null && insurance != null) // if both are not null / exist in table
		{
			savedAcc.setInsurance(insurance);// call update query on employee table to add insurance
			
			return savedAcc;
		}
		return null;
	}

	@Override
	public List<Account> getAccountByLocation(String location) {
		return accRepository.getAccountByLocation(location);
	}

	@Override
	@Transactional
	public Account updateAccount(int searchId, int balance) {
		Account savedAccount = getAccountById(searchId);
		if(savedAccount!=null)
		{
			savedAccount.setBalance(balance);
			return savedAccount;
		}
		return null;
	}

	@Override
	@Transactional
	public Account addCardNumberToAccount(int searchId, long cardNum) {
		
		Account savedAcc = getAccountById(searchId); // fetch account from table 
		DebitCard debitCard = debitCardRepository.findById((long) cardNum).get();  // fetch insurance from table
		
		if(savedAcc != null && debitCard != null) // if both are not null / exist in table
		{
			savedAcc.setDebitCard(debitCard);// call update query on employee table to add insurance	
			return savedAcc;
		}
		return null;
	}
	
	
	
	

}
