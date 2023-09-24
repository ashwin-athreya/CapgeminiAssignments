package mp.model;

import java.util.Objects;

public class Account {

	private int accountNumber;

	private String accountHolderName;

	private int balance;

	private String location;

	public Account() {
		super();
	}

	public Account(int accountNumber, String accountHolderName, int balance, String location) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
		this.location = location;
	}

 

	public int getAccountNumber() {
		return accountNumber;
	}

 

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

 

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public int getBalance() {
		return balance;
	}

 

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public String getLocation() {
		return location;
	}

 

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public int hashCode() {
		return this.accountNumber*8+this.balance*100/2;
	}

	@Override
	public boolean equals(Object obj) {

		Account a=new Account();
		if(obj instanceof Account) {
			boolean b1=this.accountHolderName.equals(a.getAccountHolderName());
			boolean b2=this.balance==a.getBalance();
			boolean b3=this.location.equals(a.getLocation());
			boolean b4=this.accountNumber==a.getAccountNumber();

			return b1&&b2&&b3&&b4;
		}
		return false;
	}

	
	
	
}
