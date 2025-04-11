package Abstraction;

public class CalibrateImplementation extends Calibrate{
	
	@Override
	int add(int a, int b) {
		return a + b;
	}
	
	@Override
	int sub(int a, int b) {
		return a - b;
	}
	
	@Override
	int mul(int a, int b) {
		return a * b;
	}
	
	@Override
	int div(int a, int b) {
		return a / b;
	}
}
