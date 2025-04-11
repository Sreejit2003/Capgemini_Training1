package interfacee;

public class Truck extends AbstractVehicle{
	public Truck(String name,int speed)
	{
		super(name,speed);
	}
	public void start()
	{
		System.out.println(name+ " Truck is starting.");
	}
	public void stop()
	{
		System.out.println(name+ " Truck has stopped");
	}
	public void displayType()
	{
		System.out.println("This is a truck.");
	}
}
