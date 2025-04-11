package Methods;

import java.util.Scanner;

public class even {
	public static void main(String[] args) {
		Scanner m=new Scanner(System.in);
		int num=m.nextInt();
		if(num%2==0)
			System.out.println(num+" is even.");
		else
			System.out.println(num+" is odd.");
	}

}
