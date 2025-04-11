package User;

import java.util.Arrays;

public class Searching {
	
	public static int linearSearch1D(int arr[], int target) {
		for(int i=0; i<arr.length; i++) {
			if(target == arr[i]) {
				return i;
			}
		}
		return -1;
	}
	
	public static int[] linearSearch2D(int arr[][], int target) {
		int rows = arr.length;
		int cols = arr[0].length;
		
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				if(target == arr[i][j]) {
					return new int[] {i,j};
				}
			}
		}
		return new int[] {-1,-1};
	}
	
	public static void main(String[] args) {
		
		//int arr[] = {12, 54, 19, 23, 46};
		int arr[][] = {{1,2,3}, {4,5,6}, {7,8,9}};
		
		int target = 19;
		
//		int result = linearSearch1D(arr, target);
//		System.out.println(result);
		
		int[] result2 = linearSearch2D(arr, target); 
		System.out.println(Arrays.toString(result2));
	}
}
