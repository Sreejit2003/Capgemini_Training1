package Sorting;

import java.util.Scanner;

public class BubbleSort {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length;
		boolean swapped;
		System.out.println("Enter the length of the array");
		length = sc.nextInt();
		int arr[] = new int[length];
		for (int i = 0; i < length; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=0; i<length-1; i++) {
			swapped = false;
			for(int j=0; j<length-1-i; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					swapped = true;
				}
			}
			
			if(!swapped) {
				break;
			}
		}
		
		System.out.println("Array after Sorting");
		for (int i = 0; i < length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		sc.close();
	}
}
