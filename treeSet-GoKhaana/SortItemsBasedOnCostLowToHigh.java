package p1;

import java.util.Comparator;

public class SortItemsBasedOnCostLowToHigh implements Comparator<Khaana>{

	@Override
	public int compare(Khaana o1, Khaana o2) {
		// TODO Auto-generated method stub
		return o1.getCost() - o2.getCost();
	}
            
}
