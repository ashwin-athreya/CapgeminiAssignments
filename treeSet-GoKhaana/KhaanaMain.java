package p1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class KhaanaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<Khaana> food = new TreeSet<>();
		
		Khaana k1 = new Khaana("Dosa", "veg", 50);
		Khaana k2 = new Khaana("Idli", "veg", 30);
		Khaana k3 = new Khaana("Biriyani","non-veg", 80);
		Khaana k4 = new Khaana("Curry", "non-veg", 60);
		
		food.add(k1);
		food.add(k2);
		food.add(k3);
		food.add(k4);
		
		for (Khaana khaana : food) {
			System.out.println(khaana);
		}
		
		System.out.println("---  food (Low to High)  ----------");
		getItemsBasedOnCostLowToHigh(food);
		
		System.out.println("---  food (Based on type)  ----------");
		getItemsBasedOnType(food);
		
		

	}
	
	public static void getItemsBasedOnCostLowToHigh(TreeSet<Khaana> food) {
		
		List<Khaana> tempList = new ArrayList<>();
		tempList.addAll(food);
		
		
		SortItemsBasedOnCostLowToHigh sortCode = new SortItemsBasedOnCostLowToHigh();
		
		Collections.sort(tempList, sortCode);
		
		for (Khaana food1 : tempList) {
			System.out.println(food1);
		}
	}
	
public static void getItemsBasedOnType(TreeSet<Khaana> food) {
		
		List<Khaana> tempList = new ArrayList<>();
		tempList.addAll(food);
		
		
		SortItemsBasedOnType sortCode = new SortItemsBasedOnType();
		
		Collections.sort(tempList, sortCode);
		
		for (Khaana food1 : tempList) {
			System.out.println(food1);
		}
	}

}
