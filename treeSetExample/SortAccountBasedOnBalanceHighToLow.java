package p1;

import java.util.Comparator;



public class SortAccountBasedOnBalanceHighToLow implements Comparator<Account> {

 

	@Override

	public int compare(Account account1, Account account2) {

		return account2.getBalance()-account1.getBalance();

	}

	

 

}