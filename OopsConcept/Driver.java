package OopsConcept;

public class Driver {
	public static void main(String[] args) { 

//		laptop l1 = new laptop("Dell", 45000, 8);
//		System.out.println(l1.brand+" "+l1.price+" "+l1.ram);
//		
//		laptop l2 = new laptop("HP", 55000, 16);
//		System.out.println(l2.brand+" "+l2.price+" "+l2.ram);
		
		Employee emp1 = new Employee("Gourav", 9865475612l, 35000);
		System.out.println(emp1.name+" "+emp1.pn+" "+emp1.salary);
		
		Employee emp2 = new Employee("Rittika", 8777986547l, 45000);
		System.out.println(emp2.name+" "+emp2.pn+" "+emp2.salary);
		
		Employee emp3 = new Employee("Shoumik", 25000);
		System.out.println(emp3.name+" "+emp3.salary);
		
	}
}
