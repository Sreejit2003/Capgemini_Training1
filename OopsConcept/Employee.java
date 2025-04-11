package OopsConcept;

public class Employee {
	
	String name;
	long pn;
	int salary;
	
	Employee(){
		
	}
	
	Employee(String name, long pn, int salary){
		this.name = name;
		this.pn = pn;
		this.salary = salary;
	}
	
	Employee(String name, int salary){
		this.name = name;
		this.salary = salary;
	}
}
