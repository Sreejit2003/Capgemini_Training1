package scannerrr;

import java.util.Scanner;

public class rangesum {
	public static void main(String[] args) {
		Scanner m=new Scanner(System.in);
		System.out.println("Enter two values");
		int a=m.nextInt();
		int b=m.nextInt();
		int sum=0;
		if(a>b)
		{
			a=a+b;
			b=a-b;
			a=a-b;
		}
			for(int i=a;i<=b;i++)
			sum+=i;
		System.out.println(sum);
		}

}
