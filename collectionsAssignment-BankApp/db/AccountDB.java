package edu.acc.e2e.db;

import edu.acc.e2e.service.LowBalanceException;

import java.util.ArrayList;

import java.util.List;

import edu.acc.e2e.model.Account;
import java.util.List;

public class AccountDB {

  List<Account> allAccounts = new ArrayList<>();
	
	public int openNewAccount(Account acc)
	{
		boolean status  = allAccounts.add(acc); // insert SQL 
		
		return status?acc.getAccountNumber():-1;
		
	}
	public List<Account> getAccountBasedOnBalanceRange(int r1,int r2) {
		List<Account> basedOnRange = new ArrayList<>();
		for (Account a : allAccounts) {
			if (a.getBalance() >= r1 && a.getBalance() <= r2) {
				basedOnRange.add(a);
			}
		}
		return basedOnRange;
	}
	
	public Account getAccountByNumber (int number){
		for (Account a : allAccounts) {
			if (a.getAccountNumber()== number) {
				return a;
			}
		}
		return null;
	}

	public List<Account> getAccountsByLocation(String s){
		List<Account> basedOnLocation = new ArrayList<>();
		
		for (Account a : allAccounts) {
			if (a.getLocation().equalsIgnoreCase(s)) {
				basedOnLocation.add(a);
			}
		}
		return basedOnLocation;
	}

	public Account insertAmount(int accNum, int amt) {
		for (Account a : allAccounts) {
			if (a.getAccountNumber() == accNum) {
				a.setBalance(a.getBalance()+amt);
				return a;
			}
		}
		return null;
	}

	public Account withdrawAmount(int accNum, int amt) throws LowBalanceException {
		for (Account a : allAccounts) {
			if (a.getAccountNumber() == accNum) {
				if (a.getBalance() >= 5000) {
					a.setBalance(a.getBalance()-amt);
					return a;
				} else {
					throw new LowBalanceException();
				}
			}
		}
		return null;
	}

	public Account transferAmount(int accNumSource,int accNumTarget, int amt) throws LowBalanceException {
		for (Account a : allAccounts) {
			if (a.getAccountNumber() == accNumSource) {
				if (a.getBalance() >= 5000) {
					a.setBalance(a.getBalance()- amt);
					return a;
				} else {
					throw new LowBalanceException();
				}
			}
		}
		for (Account a : allAccounts) {
			if (a.getAccountNumber() == accNumTarget) {
				a.setBalance(a.getBalance()+ amt);
				return a;
			}
		}
		return null;
	}

	public List<Account> getAllAccounts() {
		return allAccounts;
	}
}
