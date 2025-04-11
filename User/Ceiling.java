package User;

import java.util.*;

public class Ceiling {

	public static void finding(int arr[], int target) {
		Arrays.sort(arr);
		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (target < arr[mid]) {
				end = mid - 1;
			} else if (target > arr[mid]) {
				start = mid + 1;
			} else {
				System.out.println(mid);
				return ;
			}
		}

		System.out.println(start);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size, target;
		System.out.println("Enter the length of the array");
		size = sc.nextInt();

		int arr[] = new int[size];
		System.out.println("Enter the elements of the array");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

		}
		System.out.println("Enter the target");
		target = sc.nextInt();

		finding(arr, target);
	}
}
