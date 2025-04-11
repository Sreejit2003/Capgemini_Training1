package Methods;

public class Methods2 {
	public static void character(char ch) {
		System.out.println("ASCII value of "+ch+" is "+ (int)ch);
	}
	public static void details(String firstName, String lastName) {
		System.out.println(firstName+" "+lastName);
	}
	public static int returnAscii(char ch1) {
		return ch1;
	}
	public static void main(String[] args) {
		character('d');
		details("Sreejit","Sarkar");
		System.out.println(returnAscii('A'));
	}
}
