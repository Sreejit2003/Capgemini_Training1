package Methods;

import java.util.Scanner;

public class switchcase {
	public static void main(String[] args) {
		Scanner m=new Scanner(System.in);
		int a=m.nextInt();
		switch(a)
		{
		case 1 : System.out.println("Sunday");
		         break;
		case 2 : System.out.println("Monday");
                 break;
		case 3 : System.out.println("Tueday");
                 break;
		case 4 : System.out.println("Wednesday");
                 break;
		case 5 : System.out.println("Thursday");
                 break;
		case 6 : System.out.println("Friday");
                 break;
		case 7 : System.out.println("Saturday");
                 break;
        default : System.out.println("Error!");
		}
	}

}
