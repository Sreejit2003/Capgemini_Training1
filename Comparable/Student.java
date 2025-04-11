package Comparable;

public class Student implements Comparable{
	
	int rollno;
	String name;
	double percentage;
	
	public Student(int rollno, String name, double percentage) {
		this.rollno = rollno;
		this.name = name;
		this.percentage = percentage;
	}
	
	@Override
	public String toString() {
		return rollno+"\t"+name+"\t\t"+percentage;
	}
	
	@Override
	public int compareTo(Object o) {
		Student s = (Student) o;
//		if(this.rollno > s.rollno) {
//			return 1;
//		}
//		else if(this.rollno < s.rollno) {
//			return -1;
//		}
//		else {
//			return 0;
//		}
		
//		return Double.compare(this.percentage, s.percentage);
		
		return this.name.compareTo(s.name);
	}
}
