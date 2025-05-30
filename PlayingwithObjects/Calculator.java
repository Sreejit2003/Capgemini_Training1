package PlayingwithObjects;

public class Calculator {
	
	private double num1;
	private double num2;
	private double result;
	
	Calculator(double num1, double num2){
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public double getResult() {
		return result;
	}

	public double getNum1() {
		return num1;
	}

	public void setNum1(double num1) {
		this.num1 = num1;
	}

	public double getNum2() {
		return num2;
	}

	public void setNum2(double num2) {
		this.num2 = num2;
	}

	public void setResult(double result) {
		this.result = result;
	}
	
	public static Calculator add(Calculator c) {
		c.setResult(c.getNum1() + c.getNum2());
		return c;
	}
	
	public static Calculator multiply(Calculator c) {
		c.setResult(c.getResult() * 2);
		return c;
	}
	
}
