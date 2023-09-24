package p1;

import java.util.Objects;

public class Khaana implements Comparable<Khaana> {
      
	private String item;
	private String type;
	private int cost;
	
	public Khaana() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Khaana(String item, String type, int cost) {
		super();
		this.item = item;
		this.type = type;
		this.cost = cost;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cost, item, type);
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Khaana)
		{
			Khaana food = (Khaana)obj;
			boolean a = food.item.equals(this.getItem());
			boolean b = food.cost==this.cost;
			boolean c = food.type.equals(this.getType());
			
			
			return a && b && c ;
		}
		else
		{
			return false;
		}
	}
	@Override
	public String toString() {
		return "Khaana [item=" + item + ", type=" + type + ", cost=" + cost + "]";
	}

	@Override
	public int compareTo(Khaana o) {
		// TODO Auto-generated method stub
		 return this.getItem().compareTo(o.getItem());
	}
	
	
}
