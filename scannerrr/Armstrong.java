package scannerrr;

public class Armstrong {
	public static void main(String[] args) {
		int num = 153;
		int n = num;
		int n1 = num;
		int count = 0, sum = 0;
		
		while(n1 != 0) {
			int d = n1%10;
			n1 = n1/10;
			count++;
		}
		
		while(n != 0) {
			int d = n%10;
			sum += Math.pow(d,count);
			n = n/10; 
		}
		if(sum == num) {
			System.out.println("Armstrong Number");
		}
		else {
			System.out.println("Not a Armstrong number");
		}
	}
}
