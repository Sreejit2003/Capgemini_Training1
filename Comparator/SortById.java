package Comparator;

import java.util.Comparator;

public class SortById implements Comparator<Book>{

	@Override
	public int compare(Book o1, Book o2) {
		return (o1.id - o2.id);
	}

}
