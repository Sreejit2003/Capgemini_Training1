package Mock_Test;

public class InvalidRideException extends RuntimeException{
	
	static String message = "Invalid Ride";
	
	public InvalidRideException(String message) {
		super(message);
	}
}
