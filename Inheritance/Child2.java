package Inheritance;

public class Child2 extends Parent2{
	
	String name = "Ronaldo";
	
	void display() {
		String name = "Local";
		System.out.println(name);
		System.out.println(this.name);
		System.out.println(super.name);
	}
	
//	int grade;
//	
//	Child2 (int grade, String name){
//		super(name);
//		this.grade = grade;
//	}
}
