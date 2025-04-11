package User;

public class Reverse {
	
	public static int rev(int num) {
		int count=0, sum = 0;
		while(num != 0) {
			int d = num%10;
			sum = (sum*10) + d;
			num = num/10;
		}
		return sum;
	}
	
	public static boolean palindrome(int num) {
		
		int result = rev(num);
		
		if(result == num) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void fibonacci(int num) {
		int ft = 0, lt = 1;
		int st = 0;
		System.out.println(ft);
		System.out.println(lt);
		for(int i=2; i<num; i++) {
			st = ft + lt;
			System.out.println(st);
			ft = lt;
			lt = st;
			
		}
	}
	
	public static void main(String[] args) {
		int num = 1565;
		int num1 = 10;
		System.out.println(rev(num));
		System.out.println(palindrome(num));
		fibonacci(num1);
	}
}
