package Arrays;

import java.util.*;

public class Max2D {
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
		
		int max = arr[0][0];
		int a = 0,b = 0;
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if(arr[i][j] > max) {
					max = arr[i][j];
					a = i;
					b = j;
				}
			}
		}
		System.out.println("Array after initialization");

		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Maximum element "+max);
		System.out.println("Index of Maximum element "+a+ ","+b);
	}
}
