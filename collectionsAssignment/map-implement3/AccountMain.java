package accountPacMain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import accountpac.Account1;

public class AccountMain {

	public static void main(String[] args) {
		
		Account1 a1 = new Account1(1, "abc", 10000, "Mumbai");
		Account1 a2 = new Account1(2, "xyz", 10500, "Hyderabad");
		Account1 a3 = new Account1(3, "ghj", 20000, "Pune");
		Account1 a4 = new Account1(4, "jkl", 5000, "Mumbai");
		Account1 a5 = new Account1(5, "pqr", 35000, "Bangalore");
		  
		  Map<Integer,Account1> accountMap = new HashMap<>();
		  
		  accountMap.put(a1.getAccountNumber(), a1);
		  accountMap.put(a2.getAccountNumber(), a2);
		  accountMap.put(a3.getAccountNumber(), a3);
		  accountMap.put(a4.getAccountNumber(), a4);
		  accountMap.put(a5.getAccountNumber(), a5);

		  Scanner sc = new Scanner(System.in);
		  //System.out.println("please enter key to get account info");
		  //int key = sc.nextInt();
		  //Account1 acc = accountMap.get(key);
		  //System.out.println(acc.toString());
		  
		  System.out.println("please enter location to get account info");

		  String loc = sc.next();
		  
		  Map<String,List<Account1>> locAccount = new HashMap<>();
		  List<Account1> accountList = new ArrayList<>();
		  for(Map.Entry<Integer, Account1> accMap : accountMap.entrySet()) {
			  if(accMap.getValue().getLocation().equals(loc)) {

				  accountList.add(accMap.getValue());
				 
			  }
		  }
		  
		  locAccount.put(loc, accountList);
		  
		  System.out.println(locAccount);
		  
		  
	}
		
		
	}