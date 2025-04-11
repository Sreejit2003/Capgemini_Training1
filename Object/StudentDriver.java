package Object;

public class StudentDriver {
	public static void main(String[] args) {

		Student s = new Student("Sreejit", 564, 86.54);
		System.out.println(s);

		Student s2 = new Student("Sanjona", 874, 95.54);
		System.out.println(s2);

		System.out.println(s.equals(s2));
		
		System.out.println(s.hashCode());
		
		System.out.println(s.hashCode() != s2.hashCode());

	}
}
