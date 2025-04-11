package User;

public class SubArray {
	
	public static int contiSubArray(int arr[]) {
		
		int count = 0;
		
		for(int i=0; i<arr.length; i++) {
			int sum = 0;
			for(int j=i; j<arr.length; j++) {
				sum += arr[j];
				if(sum < 0) {
					count++;
				}
			}
		}
		return count;
	}
	
	public static int sumcontiSubArray(int arr[]) {
		
		int currentsum = arr[0];
		int max = arr[0];
		
		for(int i=1; i<arr.length; i++) {
			currentsum = Math.max(arr[i], currentsum + arr[i]);
			max = Math.max(max, currentsum);
		}
		return max;
	}
	
	public static void main(String[] args) {
		//int arr[] = {-1,2,-3,4,-5};
		int arr[] = {-2, 1, -3, 4, -1, 2,1, -5, -4};
		
//		int result = contiSubArray(arr);
		int result = sumcontiSubArray(arr);
		System.out.println(result);
	}
}
