package User;

public class DigitCount {
	
	public static int countDigits(int n) {
		int count = 0;
		while(n!=0) {
			n = n/10;
			count++;
		}
		return count;
	}
	
	public static int evenDigits(int arr[]) {
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			if(countDigits(arr[i])%2 == 0) {
				count++;
			}
		}
		return count;
	}
	
	public static int oddDigits(int arr[]) {
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			if(countDigits(arr[i])%2 != 0) {
				count++;
			}
		}
		return count;
	}
	
	public static void display(int arr[]) {
		
		System.out.println("No of Even digits in the array "+evenDigits(arr));
		System.out.println("No of Odd digits in the array "+oddDigits(arr));
	}
	
	public static void main(String[] args) {
		//int arr[] = {12, 345, 2, 6, 7896};
		int arr[] = {555, 190, 482, 1771};
		display(arr);
	}
}
