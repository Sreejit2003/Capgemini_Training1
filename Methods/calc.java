package Methods;

import java.util.Scanner;

public class calc {
	public static void main(String[] args) {
		Scanner m=new Scanner(System.in);
		System.out.println("Enter two operands.");
		int a=m.nextInt();
		int b=m.nextInt();
		System.out.println("Enter the operator.");
		char c=m.next().charAt(0);
		if(c=='+')
		System.out.println(a+b);
		else if(c=='-')
			System.out.println(a-b);
		else if(c=='*')
		System.out.println(a*b);
		else if(c=='/')
			System.out.println(a/b);
	}

}
