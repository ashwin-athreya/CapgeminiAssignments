package p1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

public class KhaanaMain2 {
	


	public static void main(String[] args) {

			Map<Khaana,List<Review>> map = new HashMap<>();


			TreeSet<Khaana> food = new TreeSet<>();


			Khaana f1 = new Khaana("Dosa","Veg", 80);

			Khaana f2 = new Khaana("Chicken Briyani", "Non Veg", 120);

			Khaana f3 = new Khaana("Idli", "Veg", 50);

			Khaana f4 = new Khaana("Paneer Sandwich", "Veg", 55);

			Khaana f5 = new Khaana("Egg Sandwich", "Non Veg", 65);


			food.add(f1);

			food.add(f2);

			food.add(f3);

			food.add(f4);

			food.add(f5);



			List<Review> revList1 = new ArrayList<>();


			Review r1A = new Review("A", 3, "Satisfied");

			Review r1B = new Review("B", 4, "Satisfied");

			Review r1C = new Review("C", 2, "Not Good ");


			revList1.add(r1A);

			revList1.add(r1B);

			revList1.add(r1C);

			map.put(f1, revList1);



			List<Review> revList2 = new ArrayList<>();
			List<Review> revList3 = new ArrayList<>();
			List<Review> revList4 = new ArrayList<>();
			List<Review> revList5 = new ArrayList<>();




			Review r2 = new Review("xyz", 4, "Very Good");

			Review r3 = new Review("fgh", 2, "Not Good ");

			Review r4 = new Review("kjj", 4, "Very Good");

			Review r5 = new Review("osj", 5, "Excellent");



			revList2.add(r2);

			revList3.add(r3);

			revList4.add(r4);

			revList5.add(r5);



			map.put(f2, revList2);

			map.put(f3, revList3);

			map.put(f4, revList4);

			map.put(f5, revList5);


			for(Map.Entry<Khaana,List<Review>> entry : map.entrySet())

			{

				Khaana key = entry.getKey();

				  List<Review> value = entry.getValue();


				 System.out.println("---- "+key.getItem()+"-------");

				 System.out.println("Price rs. "+key.getCost());

				 System.out.println("Category "+key.getType());


				 System.out.println(" --- Reviews ---");

				 for (Review review : value) {
					 
					 System.out.println("user-name: "+review.getUserName()+"\n");
                     System.out.print("Points: ");
					for(int i=0;i<review.getPoint();i++)

					{

						System.out.print("*");

					}

                     System.out.println("\n");
					 System.out.println("Comments: "+review.getComment()+"\n");

				}

				 System.out.println("\n\n");

			}






		}



	}


