package User;

public class PalindromeString {
	public static void main(String[] args) {
		String str = "Sreejit", str2="";
		for(int i=str.length()-1; i>=0;i--) {
			str2 = str2 + str.charAt(i);
		}
		if(str.equals(str2)) {
			System.out.println("Palindrome String");
		}
		else {
			System.out.println("Not a Palindrome String");
		}
	}
}
