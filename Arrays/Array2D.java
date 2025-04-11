package Arrays;

import java.util.*;

public class Array2D {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row, col;
		System.out.println("Enter number of rows and columns of the array");
		row = sc.nextInt();
		col = sc.nextInt();
		int arr[][] = new int[row][col];
		System.out.println("Enter the elements of the array");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("Array after initialization");

//		for(int i=0; i<row; i++) {
//			for(int j=0; j<col; j++) {
//				System.out.print(arr[i][j]+" ");
//			}
//			System.out.println();
//		}

//		for (int[] a : arr) {
//			for (int b : a) {
//				System.out.print(b + " ");
//			}
//			System.out.println();
//		}

		for (int a[] : arr) {

			System.out.println(Arrays.toString(a));
		}

		sc.close();
	}
}
