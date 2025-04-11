package exception;

public class try2 {
	
	public static int p()
	{
		try {
		return 1;}
				catch(Exception e)
		{return 2;}
		finally
		{
			return 3;
		}
		
	}
	public static void main(String[] args) {
		System.out.println(p());
	}

}
