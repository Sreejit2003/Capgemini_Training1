package Mock_Test;

import java.util.Scanner;
import java.io.IOException;
import java.util.Optional;

public class Main {
	public static void main(String[] args) throws IOException {

		RideBookingSystem system = new RideBookingSystem();
		Scanner sc = new Scanner(System.in);

		system.loadDriversFromFile();

		boolean running = true;
		while (running) {
			System.out.println("\n--- Ride Booking System ---");
			System.out.println("1. Register a Customer");
			System.out.println("2. Register a Driver");
			System.out.println("3. Book a Ride");
			System.out.println("4. Show All Drivers");
			System.out.println("5. Save Data and Exit");
			System.out.print("Choose an option: ");
			int choice = sc.nextInt();
			sc.nextLine(); // Consume leftover newline

			switch (choice) {
			case 1:
				System.out.print("Enter Customer ID: ");
				String cid = sc.nextLine();
				System.out.print("Enter Customer Name: ");
				String cname = sc.nextLine();
				system.registerCustomer(new Customer(cid, cname));
				break;

			case 2:
				System.out.print("Enter Driver ID: ");
				String did = sc.nextLine();
				System.out.print("Enter Driver Name: ");
				String dname = sc.nextLine();
				system.registerDriver(new Driver(did, dname));
				break;

			case 3:
				System.out.print("Enter Customer ID to Book Ride: ");
				String customerId = sc.nextLine();
				Optional<Customer> customerOpt = system.getCustomers().stream().filter(c -> c.id.equals(customerId))
						.findFirst();
				if (customerOpt.isPresent()) {
					try {
						system.bookRide(customerOpt.get());
					} catch (InvalidRideException e) {
						System.out.println(e.getMessage());
					}
				} else {
					System.out.println("Customer ID not found.");
				}
				break;
				
			case 4:
				system.showAllDrivers();
				break;

			case 5:
				system.saveDriversToFile();
				system.saveRides();
				running = false;
				System.out.println("Data saved. Exiting system. Goodbye!");
				break;

			default:
				System.out.println("Invalid option. Try again.");
			}
		}

		sc.close();
	}
}
