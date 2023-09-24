package mapEx;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class MappingImplement1 {
	Map<Integer,String> map=new HashMap<>();
	Scanner scan=new Scanner(System.in);

	public static void main(String[] args) {

		MappingImplement1 app=new MappingImplement1();
		Scanner sc=new Scanner(System.in);
		Map<Integer,String> map=new HashMap<>();
		
		while(true) {
			System.out.println("----------Operations----------");
			System.out.println("1.add element to hashmap");
			System.out.println("2.Get element based on key");
			System.out.println("3.Print all Elements from Map");
			System.out.println("0.exit");

			System.out.println("Enter your Choice");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				app.addElementToHashMap();
				break;

			case 2:
				System.out.println("Enter the key");
				app.getElementByKey();
				break;

			case 3:
				app.getAllElementsFromMap();
				break;

			case 0:
				System.exit(0);
			}
		}//end of while
	}//end of main

	private void getAllElementsFromMap() {
		for(Map.Entry<Integer, String> entry: map.entrySet()) {
			int key=entry.getKey();
			String value=entry.getValue();
			System.out.println(key+" "+value);
		}
	}
	
	private void getElementByKey() {
		int key=scan.nextInt();
		String element=map.get(key);
		System.out.println(element);
	}

	private void addElementToHashMap() {
		System.out.println("Enter Key: ");
		int key=scan.nextInt();
		System.out.println("\nEnter Value: ");
		String value=scan.next();
		//int i=0;
		map.put(key, value);
	}
}
