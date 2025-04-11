package Arrays;

import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter the length of the array");
		n = sc.nextInt();
		
		double arr[] = new double[n];
		System.out.println("Enter the elements");
		for(int i=0; i<arr.length;i++) {
			arr[i] = sc.nextDouble();
		}
		
		for(int i=n-1; i>=0;i--) {
			System.out.println(arr[i]);
		}
	}
}
