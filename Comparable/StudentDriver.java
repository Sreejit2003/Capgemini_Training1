package Comparable;

import java.util.*;

public class StudentDriver {
	public static void main(String[] args) {
		
		Student[] students = {
				new Student(1, "Sreejit", 99.99),
				new Student(4, "Sanjona", 97.99),
				new Student(5, "Gourav", 98.99),
				new Student(2, "Shoumik", 97.86),
				new Student(3, "Rittika", 95.46),
		};
		
		Arrays.sort(students);
		
		for (Student student : students) {
			System.out.println(student);
		}
	}
}
