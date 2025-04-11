package Comparator;

public class Book {
	
	int id;
	String name;
	double price;
	
	public Book(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return id+"\t"+name+"\t\t"+price;
	}
}
