package User;

import java.util.Arrays;

public class BinarySearch {
	public static int search(int arr[], int target) {
		Arrays.sort(arr);
		int start = 0;
		int end = arr.length - 1;
		
		while(start <= end) {
			int mid = start + ((end - start)/2);
			if(arr[mid] == target) {
				return mid;
			}
			else {
				if(target < arr[mid]) {
					end = mid;
				}
				else if(target > arr[mid]) {
					start = mid +1;
				}
			}
		}
		return -1;
	}
	
	
	public static void main(String[] args) {
		int arr[] = {8,6,4,3,9,7};
		int result = search(arr, 9);
		System.out.println(result);
	}
}
