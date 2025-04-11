package interfacee;

public class Car extends AbstractVehicle{
	public Car(String name,int speed)
	{
		super(name,speed);
	}
	public void start()
	{
		System.out.println(name+ " car is starting.");
	}
	public void stop()
	{
		System.out.println(name+ " car has stopped");
	}
	public void displayType()
	{
		System.out.println("This is a car.");
	}
}
