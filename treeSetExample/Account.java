package p1;

import java.util.Objects;





public class Account implements Comparable<Account>{

	private int accountNumber;

	private String accountHolderName;

	private int balance;

	private String location;

	

	

	public Account() {

	

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

	public String toString() {

		return "Account [accountNumber=" + accountNumber + ", accountHolderName=" + accountHolderName + ", balance="

				+ balance + ", location=" + location + "]";

	}

 

 

	@Override

	public int hashCode() {

		return Objects.hash(accountHolderName, accountNumber, balance, location);

	}

 

 

	@Override

	public boolean equals(Object obj) {

		

		if(obj instanceof Account)

		{

			Account account = (Account)obj;

			boolean a = account.accountHolderName.equals(this.getAccountHolderName());

			boolean b = account.accountNumber==this.accountNumber;

			boolean c = account.balance==this.balance;

			boolean d = account.location.equals(this.getLocation());

			

			return a && b && c && d ;

		}

		else

		{

			return false;

		}

		

	}	@Override

	public int compareTo(Account account) {

		

		return this.getAccountHolderName().compareTo(account.getAccountHolderName());

	}

 

 

 

}
