package interfacee;

import java.util.Scanner;

public class VehicleTest {
	public static void main(String[] args) {
		Scanner m=new Scanner(System.in);
		AbstractVehicle a=null;
		System.out.println("Enter 1 for Car 2 for Bike 3 for Truck");
		int ch=m.nextInt();
		switch(ch)
		{
		case 1: a=new Car(m.next(),m.nextInt());
				a.start();
				a.displayDetails();
				a.start();
				a.accelerate(m.nextInt());
				a.brake(ch);
				System.out.println(a.getCurrentSpeed());
				a.stop();
				a.displayType();
				break;
				
		case 2: a=new Bike(m.next(),m.nextInt());
		a.start();
		a.displayDetails();
		a.start();
		a.accelerate(m.nextInt());
		a.brake(ch);
		System.out.println(a.getCurrentSpeed());
		a.stop();
		a.displayType();
		break;
		
		case 3:a=new Truck(m.next(),m.nextInt());
		a.start();
		a.displayDetails();
		a.start();
		a.accelerate(m.nextInt());
		a.brake(ch);
		System.out.println(a.getCurrentSpeed());
		a.stop();
		a.displayType();
		break;
		
		default : System.out.println("Invalid choice");
		
				
		}
		m.close();
	}
}
