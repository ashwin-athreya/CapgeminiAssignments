package p1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;


public class KhaanaMainn3 {

	public static void main(String[] args) {

		Map<Khaana, List<Review>> allmap = new TreeMap<>();

		Review r1 = new Review("Shubham",4, "Taste is Nice.");
		Review r2 = new Review("Sanket",1, "Taste is worst.");
		Review r3 = new Review("",2, "Food is not Fresh.");
		Review r4 = new Review("Pranay",3, "Taste is ok");
		Review r5 = new Review("Shekhar",5, "Fantastic");

		Khaana f1 = new Khaana("VadaPav", "Veg", 20);
		Khaana f2 = new Khaana("Pavbhaji", "Veg", 100);
		Khaana f3 = new Khaana(" Biryani", "NonVeg", 150);
		Khaana f4 = new Khaana("Cake", "NonVeg", 30);

		List<Review> review1 = new ArrayList<>();
		review1.add(r1);
		review1.add(r2);

		List<Review> review2 = new ArrayList<>();
		review2.add(r3);
		review2.add(r4);

		List<Review> review3 = new ArrayList<>();
		review3.add(r5);
		review3.add(r1);

		List<Review> review4 = new ArrayList<>();
		review4.add(r2);
		review4.add(r3);

		allmap.put(f1, review1);
		allmap.put(f2, review2);
		allmap.put(f3, review3);
		allmap.put(f4, review4);

		allmap.forEach((food,reviews) -> 
		{
			System.out.println("\n----------- Food - "+food.getItem()+"----------\n");
			System.out.println("Price - "+food.getCost());
			System.out.println("Category - "+food.getType());
			System.out.println("Reviews - ");
			
			for(Review review: reviews)
			{
				System.out.println("    Username - "+review.getUserName());
				
				try {
					if(review.getUserName()== null ||review.getUserName().isEmpty()) {
						throw new UserNameMisssingException("Username Is Missing In Review.");
					}
				} 
				catch (UserNameMisssingException e) {
					System.out.println(e);
				}
				
				System.out.println("    Rating Points - "+review.getPoint());
				System.out.println("    Comment - "+review.getComment()+"\n");
			}
			System.out.println("-------------------------------------");
			});

		averageRating(allmap);
		numOfReviews(allmap);

	}		

	public static void averageRating(Map<Khaana, List<Review>> allmap) {
		allmap.forEach((food,reviews) -> {
			System.out.println("\n----------- Food - "+food.getItem()+"----------\n");
			float totalRating = 0;
			float avgRating = 0;
			for(Review review: reviews) {
				totalRating += review.getPoint();
				avgRating = totalRating / reviews.size();
			}
			System.out.println("Average Rating - "+ avgRating);
			System.out.println("-------------------------------------");
			});
	}

	public static void numOfReviews(Map<Khaana, List<Review>> allmap) {
		allmap.forEach((food,reviews) -> {
			System.out.println("\n----------- Food - "+food.getItem()+"----------\n");
			int size = reviews.size();
			System.out.println("Reviews - "+ size);
			System.out.println("-------------------------------------");
			});
	}
	}



 











































