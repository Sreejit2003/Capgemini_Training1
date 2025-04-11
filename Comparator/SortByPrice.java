package Comparator;

import java.util.Comparator;

public class SortByPrice implements Comparator<Book>{

	@Override
	public int compare(Book o1, Book o2) {
		return Double.compare(o1.price, o2.price);
	}
	
}
