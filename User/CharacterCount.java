package User;

import java.util.Scanner;

public class CharacterCount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		char ch;
		int count = 0;
		System.out.println("Enter the String");
		str = sc.nextLine();
		System.out.println("Enter the character to be searched");
		ch = sc.next().charAt(0);
		for(int i=0; i<str.length();i++) {
			char ch1 = str.charAt(i);
			if(ch == ch1) {
				count++;
			}
		}
		System.out.println("The occurence of "+ch+" in "+str+" is "+count);
		
		sc.close();
	}
}
