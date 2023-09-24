package edu.acc.e2e.service;

import java.util.List;

import edu.acc.e2e.db.AccountDB;
import edu.acc.e2e.model.Account;


public class AccountServer {
	
    private AccountDB db;
	
	public AccountServer() {
		db = new AccountDB();
		// database connection code
    }
	
	public String openNewAccount(Account acc)
	{
		int fromDB = db.openNewAccount(acc);
		if(fromDB != -1)
		{
			return " New Account Number "+fromDB;
		}
		else 
		{
			return "ERROR !!! Contact to Customer Service";
		}
		 
	}
	public List<Account> getAccountBasedOnBalanceRange(int r1,int r2){
		return db.getAccountBasedOnBalanceRange(r1, r2);
	}

	public Account getAccountByNumber (int number) {
		return db.getAccountByNumber(number);
	}

	public List<Account> getAccountsByLocation(String s){
		return db.getAccountsByLocation(s);
	}

	public Account insertAmount(int accNum, int amt) {
		return db.insertAmount(accNum, amt);
	}

	public Account withdrawAmount(int accNum, int amt) throws LowBalanceException {
		return db.withdrawAmount(accNum, amt);
	}

	public Account transferAmount(int accNumSource,int accNumTarget, int amt) throws LowBalanceException {
		return db.transferAmount(accNumSource, accNumTarget, amt);
	}
	
	public List<Account> getAllAccounts()
	{
		return db.getAllAccounts();
	}


}
