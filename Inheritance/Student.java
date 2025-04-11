package Inheritance;

public class Student extends Person{
	
	private int studentId;
	
	Student(int studentId,int age, String name){
		super(name, age);
		this.studentId = studentId;
	}
	
	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	void displayDetails() {
		System.out.println(studentId);
		System.out.println(super.getName());
		System.out.println(super.getAge());
		
	}
}
