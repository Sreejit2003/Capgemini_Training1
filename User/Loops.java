package User;

import java.util.Scanner;

public class Loops {
	
	public static int digits(int num) {
		int c1 = 0, c2 = 0;
		int count = 0;
		int a;
		while(num != 0) {
			a = num % 10;
			if(a % 2 ==0) {
				c1++;
			}
			else {
				c2++;
			}
			num = num/10;
		}
		int p = c1 * c2;
		return p;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		System.out.println(digits(num));
	}
}
