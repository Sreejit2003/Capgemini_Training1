package Arrays;

import java.util.*;

public class SumElementArray {
	
	public static int[] sumOfElement(int arr[]) {
	
		int newarr[] = new int[arr.length];
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
			newarr[i] = sum;
		}
		return  newarr;
	}
	
	public static void main(String[] args) {
		int arr[] = {1,2,3,4};
		System.out.println(Arrays.toString(sumOfElement(arr)));
	}
}
