package mp.ui;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

import mp.model.Account;

public class AccountUI {
	
	Scanner scan=new Scanner(System.in);
	Map<Integer,Account> map=new HashMap<>();

	public static void main(String[] args) {
		AccountUI app=new AccountUI();
		while(true) {
			System.out.println(" ----- OPERATIONS ----");
			System.out.println("1. Insert Account to add it in Map ");
			System.out.println("2.GetAll Accounts Based on Location");
			System.out.println("3.Get All Accounts Based on Salary Range ");
			System.out.println("4.Get Account Based on Account Number");

			System.out.println("0. Exit");
			System.out.println("Enter Option :- ");

			switch(new Scanner(System.in).nextInt()) {
			case 1:
				app.addAccountToMap();
				break;
			case 2:
				app.getAllAccountsBasedOnLocation();
				break;
			case 3:
				app.getAccountBasedOnBalanceRange();
				break;
			case 4:
				app.getAccountBasedOnAccountNumber();
				break;
			case 0:
				System.out.println("ProcessEnded");
				System.exit(0);
			}
		}//end of while
	}//end of main

	private void getAccountBasedOnAccountNumber() {
		System.out.print("Enter AccountNumber to be Searched: ");
		int accountNumber=scan.nextInt();
		for(Map.Entry<Integer, Account> entry: map.entrySet()) {
			int key=entry.getKey();
			Account a=entry.getValue();
			if(a.getAccountNumber()==accountNumber) {
				displayAccounts(a);
			}
		}
	}
	private void getAccountBasedOnBalanceRange() {
		System.out.print("Enter Minimum Amount: ");
		int r1=scan.nextInt();
		System.out.print("Enter Minimum Amount: ");
		int r2=scan.nextInt();

		for(Map.Entry<Integer, Account> entry: map.entrySet()) {
			int key=entry.getKey();
			Account a=entry.getValue();
			if(a.getBalance()>=r1 && a.getBalance()<=r2) {
				displayAccounts(a);
			}
		}
	}

	private void getAllAccountsBasedOnLocation() {
		System.out.print("Enter Location to be Searched: ");
		String location=scan.next();
		for(Map.Entry<Integer, Account> entry: map.entrySet()) {
			int key=entry.getKey();
			Account a=entry.getValue();
			if(a.getLocation().equals(location)) {
				displayAccounts(a);
			}

 

		}

 

	}

	private void addAccountToMap() {
		int accountNumber=new Random().nextInt(1000000);

		System.out.print("Enter Account Holder Name: ");
		String name=scan.next();

		System.out.print("Enter Balance: ");
		int balance=scan.nextInt();

		System.out.print("Enter Location: ");
		String location=scan.next();

		Account a=new Account(accountNumber,name,balance,location);
		map.put(a.getAccountNumber(), a);
	}

	//method to print accounts
	private void displayAccounts(Account a) {
		System.out.println("Account Number = " + a.getAccountNumber() + ", Account Holder Name = " + a.getAccountHolderName() + ", Balance = "
				+ a.getBalance() + ", Location = " + a.getLocation());
	}

}
