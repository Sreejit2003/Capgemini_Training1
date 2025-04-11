package Methods;

public class Calculator {
	public static double sum(double m1, double m2) {
		double s = m1 + m2;
		return s;
	}

	public static int multi(double m1, double m2, double m3) {
		int m = (int) (m1 *  m2 *  m3) ;
		return m;
	}

	public static void answer() {
		double avg = sum(54, 98) / 2;
		System.out.println(avg);
		System.out.println(sum(20.8, 30.7));
		System.out.println(multi(5.2, 6.3, 8.6));
	}

	public static void main(String[] args) {
		answer();
	}
}
