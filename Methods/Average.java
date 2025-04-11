package Methods;

public class Average {
	public static int sum(int m1, int m2) {
		int s = m1+m2;
		return s;
	}
	public static void average() {
		double avg = sum(54,98)/3;
		System.out.println(avg);
	}
	public static void main(String[] args) {
		average();
	}
}
