package Arrays;

import java.util.*;

public class ArrayUtil {
	public static void main(String[] args) {
		int arr[] = {2,6,9,8,3,4,1};
		System.out.println(Arrays.toString(arr));
		int ar[] = Arrays.copyOf(arr, 10);
		Arrays.sort(ar);
		System.out.println(Arrays.toString(ar));
	}
}
