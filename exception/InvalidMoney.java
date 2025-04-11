package exception;

public class InvalidMoney extends RuntimeException{
	static String str="Enter money greater than 0";
	InvalidMoney(){
		super(str);
	}
}
