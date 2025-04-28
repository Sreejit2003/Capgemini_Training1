package File_Handling;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\User\\Desktop\\Capgemini\\File Handling//Employee.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Employee employee = (Employee) ois.readObject();
		
		System.out.println(employee.getId());
		System.out.println(employee.getName());
		System.out.println(employee.getSalary());
		
		ois.close();
	}
}
