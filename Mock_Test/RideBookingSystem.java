package Mock_Test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class RideBookingSystem {

	private List<Customer> customers;
	private List<Driver> drivers;
	private List<Ride> rides;

	public RideBookingSystem() {
		customers = new ArrayList<>();
		drivers = new ArrayList<>();
		rides = new ArrayList<>();
	}

	public void registerCustomer(Customer customer) {
		customers.add(customer);
		System.out.println("Customer Registered Successfully");
	}

	public void registerDriver(Driver driver) {
		drivers.add(driver);
		System.out.println("Driver Registered Successfully");
	}

	public Ride bookRide(Customer customer) {
		Optional<Driver> availableDriver = drivers.stream().filter(Driver::isAvailable).findFirst();

		if (availableDriver.isPresent()) {
			Driver driver = availableDriver.get();
			driver.setAvailable(false);
			Ride ride = new Ride(customer, driver);
			rides.add(ride);
			System.out.println("Ride Booked Successfully.");
			return ride;
		} else {
			throw new InvalidRideException("No available drivers at the moment!");
		}
	}

	public void saveRides() throws IOException {
		try (BufferedWriter writer = new BufferedWriter(
				new FileWriter("C:\\Users\\User\\Desktop\\Capgemini Mock\rides.txt"))) {
			for (Ride ride : rides) {
				writer.write(ride.ridedetails());
				writer.newLine();
			}
			System.out.println("Rides saved to rides.txt.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void loadDriversFromFile() {
		try (BufferedReader reader = new BufferedReader(
				new FileReader("C:\\Users\\User\\Desktop\\Capgemini Mock\\drivers.txt"))) {
			String line;
			while ((line = reader.readLine()) != null) {
				String[] parts = line.split(",");
				if (parts.length >= 2) {
					registerDriver(new Driver(parts[0], parts[1]));
				}
			}
			System.out.println("Drivers loaded from drivers.txt.");
		} catch (IOException e) {
			System.out.println("No drivers file found. Starting fresh.");
		}
	}

	public void saveDriversToFile() {
		try (BufferedWriter writer = new BufferedWriter(
				new FileWriter("C:\\Users\\User\\Desktop\\Capgemini Mock\\drivers.txt"))) {
			for (Driver driver : drivers) {
				writer.write(driver.id + "," + driver.name);
				writer.newLine();
			}
			System.out.println("Drivers saved to drivers.txt.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void showAllDrivers() {
		for (Driver driver : drivers) {
			driver.showProfile();
		}
	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}
}
