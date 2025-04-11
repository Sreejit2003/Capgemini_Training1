package User;

public class PalinSub {
	
	public static int countSubStrings(String str) {
		int n = str.length();
		int a,b;
		int ans = 0;
		for(int i = 0; i < n; i++) {
			a = i;
			b = i;
			while(a>=0 && b<n && (str.charAt(a) == str.charAt(b))) {
				ans ++;
				a--;
				b++;
			}
			
			a = i;
			b = i + 1;
			
			while(a>=0 && b<n && (str.charAt(a) == str.charAt(b))) {
				ans ++;
				a--;
				b++;
			}
		}
		return ans;
	}
	
	public static void main(String[] args) {
//		int result = countSubStrings("abcba");
		int result = countSubStrings("abcbaa");
		
		System.out.println(result);
	}
}
