package File_Handling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization {
	public static void main(String[] args) throws IOException {
		
		FileOutputStream f = new FileOutputStream("C:\\Users\\User\\Desktop\\Capgemini\\File Handling\\Employee.txt");
		ObjectOutputStream o = new ObjectOutputStream(f);
		
		Employee employee = new Employee(1, "Sreejit", 35000);
		
		o.writeObject(employee);
		
		System.out.println("Employee saved to file");
	}
}
