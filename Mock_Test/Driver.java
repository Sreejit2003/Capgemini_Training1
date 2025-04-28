package Mock_Test;

public class Driver extends User{

	private boolean available ;
	
	public Driver(String id, String name) {
		super(id, name);
		available = true;
	}

	@Override
	void showProfile() {
		System.out.println("Driver Name: "+this.getName()+"Availabality Status: "+ isAvailable());
	}
	
	public boolean isAvailable() {
		if(available == true) {
			return true;
		}
		else {
			return false;
		}
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}
	
}
