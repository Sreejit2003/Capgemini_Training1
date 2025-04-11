package typesofdatatypes;

public class Reverse {
	public static void main(String[] args) {
		int number = -123;
		int rev = 0;
		while(number!=0) {
			int d = number % 10;
			rev = (rev*10) + d;
			number = number / 10;
		}
		System.out.print(rev);
	}
}
