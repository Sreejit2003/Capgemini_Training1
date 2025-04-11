package Object;

import java.util.Objects;

public class Student {

	private int student_id;
	private String name;
	private double percentage;
	
	public Student(String name, int student_id, double percentage){
		this.name = name;
		this.student_id = student_id;
		this.percentage = percentage;
	}

	public int getStudent_id() {
		return student_id;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	
	@Override
	public String toString() {
		return this.name+" "+this.student_id+" "+this.percentage;
	}
	
	@Override
	public boolean equals(Object obj) {
		Student s = (Student) obj;
		return this.name.equals(s.name) && this.student_id == s.student_id && this.percentage == s.percentage;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(this.name, this.student_id, this.percentage);
	}
}
