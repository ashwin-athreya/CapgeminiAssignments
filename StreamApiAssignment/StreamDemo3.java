package p1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo3 {
	
	static List<Account> allAccounts; 
	
	public static void main(String[] args) {
		
		  Account a1 = new Account(1,"Anil", 15000, "Pune");
		  Account a2 = new Account(2,"Kumar", 10500, "Hyderabad");
		  Account a3 = new Account(3,"Pavan", 20000, "Mumbai");
		  Account a4 = new Account(4,"Harsha", 6000, "Mumbai");
		  Account a5 = new Account(5,"Kishore", 35000, "Bangalore");
		  
		  allAccounts = Arrays.asList(a1,a2,a3,a4,a5);
		  
		  callForEach();
		  callFilter();
		  
		  List<Account> list = callFilterWithCollectOperation();
	}
	
	public static List<Account> callFilterWithCollectOperation()
	{
		List<Account> outputList = allAccounts.stream().filter((emp)->{
			
			if(emp.getBalance()>15000) return true;
			else return false;
			
		}).collect(Collectors.toList());
		
		return outputList;
	}
		
	public static void callFilter()
	{
		allAccounts.stream().filter((emp)->{
			if(emp.getBalance()>15000) return true;
			else return false;
		}).forEach((emp)->{
			System.out.println(emp);
		});
		
		
	}

	public static void callForEach()
	{
		allAccounts.stream().forEach((e)->{
			System.out.println(e.getAccountHolderName());
		});
	}
}