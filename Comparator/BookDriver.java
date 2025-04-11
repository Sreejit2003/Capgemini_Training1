package Comparator;

import java.util.*;

public class BookDriver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Book books[] = {
			new Book(4, "Fast Five", 799),	
			new Book(2, "Harry Potter", 999),	
			new Book(1, "Abduction", 599),	
			new Book(3, "G.I. Joe", 1299),	
		};
		
		SortById id = new SortById();
		SortByName name = new SortByName();
		SortByPrice price = new SortByPrice();
		
		System.out.println("Enter your choice");
		System.out.println("1: For Sorting By ID");
		System.out.println("2: For Sorting By Name");
		System.out.println("3: For Sorting By Price");
		int ch = sc.nextInt();
		
		switch(ch) {
		
		case 1:
			Arrays.sort(books, id);
			for(Book b : books) {
				System.out.println(b);
			}
			break;
			
		case 2:
			Arrays.sort(books, name);
			for(Book b : books) {
				System.out.println(b);
			}
			break;
			
		case 3:
			Arrays.sort(books, price);
			for(Book b : books) {
				System.out.println(b);
			}
			break;
			
		default:
			System.out.println("Invalid input");
		}
		
		
		sc.close();
	}
}
