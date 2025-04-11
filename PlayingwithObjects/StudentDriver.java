package PlayingwithObjects;

public class StudentDriver {

	public static void main(String[] args) {
		Class clazz = new Class(10);
		
		clazz.addStudents("Sreejit");
		clazz.addStudents("Sam");
		clazz.addStudents("Smith");
		
		clazz.display();
	}
}
