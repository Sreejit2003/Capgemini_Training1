package Methods;

public class method {
	public static void m1() {
		System.out.println("m1");
	}
	public static void m2() {
		m1();
		System.out.println("m2");
	}
	public static void main(String[] args) {
		System.out.println("main");
	}
	public void m3() {
		System.out.println("m3");
		m2();
	}
}
