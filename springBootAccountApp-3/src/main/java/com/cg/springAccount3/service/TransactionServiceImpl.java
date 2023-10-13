package com.cg.springAccount3.service;

import com.cg.springAccount3.entity.Account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.springAccount3.entity.Transaction;
import com.cg.springAccount3.repository.ITrasactionRepository;

import java.util.List;

import javax.transaction.Transactional;

@Service
public class TransactionServiceImpl implements ITransactionService {

	
	@Autowired
	ITrasactionRepository transactionRepository;
	
	@Autowired
	IAccountService accountService;
	
	@Override
	public int saveTransaction(Transaction transaction) {
		int insCode = 0;
		if(transaction != null) {
			Transaction savedTrans = transactionRepository.save(transaction);
			insCode = savedTrans.getTransactionId();
		}
		return insCode;
	}

	@Override
	public Transaction getTransactionById(int id) {
		return transactionRepository.findById(id).get();
	}

	@Override
	@Transactional
	public String allocateTransactionToAccount(int accountId, int transactionId) {
		String status = "";
		Account a = accountService.getAccountById(accountId);
		Transaction t = getTransactionById(transactionId);
		if(a !=null && t !=null)
		{
			List<Transaction> allTransactions = a.getAllTransaction();
			allTransactions.add(t);
			a.setAllTransaction(allTransactions);// update query
			status = "Transaction allocated , Transaction Count :- "+ a.getAllTransaction().size();
		}
		else 
		{
			status = "Transaction "+t+" or Account "+a;
		}
		return status;
	}

}
