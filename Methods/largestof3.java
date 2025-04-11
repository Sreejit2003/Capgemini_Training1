package Methods;

import java.util.Scanner;

public class largestof3 {
	public static void main(String[] args) {
		Scanner m=new Scanner(System.in);
		int a=m.nextInt();
		int b=m.nextInt();
		int c=m.nextInt();
		if(a>b)
		{
			if(a>c)
				System.out.println(a+" is largest.");
			else
				System.out.println(c+" is largest.");
			
		}
	}

}
