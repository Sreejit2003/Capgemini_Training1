package exception;

public class try1 {
	public static void printnum() throws InterruptedException
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println(i);
			Thread.sleep(2000);
		}
	}
	public static void dem() throws InterruptedException
	{
		printnum();
	}
	public static void main(String[] args) throws InterruptedException {
		dem();
	}

}
