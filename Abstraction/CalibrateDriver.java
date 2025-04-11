package Abstraction;

public class CalibrateDriver {
	public static void main(String[] args) {
		Calibrate c = new CalibrateImplementation();
		System.out.println(c.add(20, 10));
		System.out.println(c.sub(20, 10));
		System.out.println(c.mul(20, 10));
		System.out.println(c.div(20, 10));
	}
}
