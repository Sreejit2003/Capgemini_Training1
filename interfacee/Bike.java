package interfacee;

public class Bike extends AbstractVehicle{
	public Bike(String name,int speed)
	{
		super(name,speed);
	}
	public void start()
	{
		System.out.println(name+ " bike is starting.");
	}
	public void stop()
	{
		System.out.println(name+ " bike has stopped");
	}
	public void displayType()
	{
		System.out.println("This is a bike.");
	}
	

}
