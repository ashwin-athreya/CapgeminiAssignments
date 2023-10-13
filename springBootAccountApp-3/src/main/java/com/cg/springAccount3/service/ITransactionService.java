package com.cg.springAccount3.service;

import org.springframework.stereotype.Service;

import com.cg.springAccount3.entity.Transaction;

@Service
public interface ITransactionService {

	public int saveTransaction(Transaction transaction);
	public Transaction getTransactionById(int id);
	
	public String allocateTransactionToAccount(int accountId,int transactionId);
	//public List<Transaction> getallAllocatedTransactionsByAccount(int accountId);
}
