package Arrays;

import java.util.*;

public class Practice {

	public static int sum(int arr[][]) {

		int sum = 0;
		int row = arr.length;
		int col = arr[0].length;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (arr[i][j] % 2 == 0) {
					sum += arr[i][j];
				}
			}
		}
		return sum;
	}
	public static void sumofcolumns(int arr[][]) {
		
		int row = arr.length;
		int col = arr[0].length;
		for (int j = 0; j < col; j++) {
			int sum = 0;
			for (int i = 0; i < row; i++) {
				
					sum += arr[i][j];
				
			}
			System.out.println(sum);
		}
	}

	public static void sumofrows(int arr[][]) {
		
		int row = arr.length;
		int col = arr[0].length;
		for (int i = 0; i < col; i++) {
			int sum = 0;
			for (int j = 0; j < row; j++) {
				
					sum += arr[i][j];
				
			}
			System.out.println(sum);
		}

	}


	public static void main(String[] args) {
		int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int result = sum(arr);
		System.out.println("Sum of even numbers: "+result);
		System.out.println("Sum of each row ");
		sumofrows(arr);
		System.out.println("Sum of each column ");
		sumofcolumns(arr);
	}
}
