package p1;

import java.util.Comparator;

public class SortItemsBasedOnType implements Comparator<Khaana> {

	@Override
	public int compare(Khaana o1, Khaana o2) {
		// TODO Auto-generated method stub
		return o1.getType().compareTo(o2.getType());
	}
       
}
