package Mock_Test;

import java.util.List;

@SecurityCheck(role = "Admin")
public class Admin extends User {

	public Admin(String id, String name) {
		super(id, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	void showProfile() {
		System.out.println("Admin's Name " + name + " | Role: Admin");
	}

	public void removeDriver(List<Driver> drivers, String driverId) {
		
	}
}
