package Object;

import java.util.Objects;

public class Employee {
	
	String name;
	double salary;
	int age;
	
	public Employee(String name, double salary, int age) {
		this.name = name;
		this.salary = salary;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return this.name+" "+this.salary+" "+this.age;
	}
	
	@Override
	public boolean equals(Object obj) {
		Employee e = (Employee) obj;
		return this.name.equals(e.name) && this.age == e.age && this.salary == e.salary;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(this.name, this.salary, this.age);
	}
}
