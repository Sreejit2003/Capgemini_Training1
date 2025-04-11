package Object;

public class EmployeeDriver {
	
	public static void main(String[] args) {
		Employee e = new Employee("Sreejit", 40000, 21);
		System.out.println(e);
		
		Employee e2 = new Employee("Samir", 30000, 22);
		System.out.println(e2);
		
		System.out.println(e.equals(e2));
		
		System.out.println(e.hashCode() == e2.hashCode());
	}
}
