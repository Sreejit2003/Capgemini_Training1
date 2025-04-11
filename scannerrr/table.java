package scannerrr;

import java.util.Scanner;

public class table {
	public static void main(String[] args) {
	     Scanner m=new Scanner(System.in);
	     System.out.println("Enter a number.");
	     int num=m.nextInt();
	     for(int i=1;i<=10;i++)
	     {
	    	 System.out.println(num+" x "+i+" = "+(num*i));
	     }
	}

}
