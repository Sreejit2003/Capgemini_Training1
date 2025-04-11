package Methods;

import java.util.Scanner;

public class forloop {
	public static void main(String[] args) {
		Scanner m=new Scanner(System.in);
		System.out.println("Enter two values");
		int a=m.nextInt();
		int b=m.nextInt();
		for(int i=a;i<=b;i++)
		{
			System.out.println(i+" ");
		}
	}

}
