package User;

public class Exceptions {
	
	public static void ArrayExceptionOutOfBound(int arr[]) {
		try {
			System.out.println(arr[0]);
			System.out.println(arr[9]);
			System.out.println(arr[3]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
	
	public static void ExceptionNullPointer() {
		Object obj = null;
		try {
			System.out.println(obj.toString());
		}
		catch(NullPointerException e){
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
	}
	
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		ArrayExceptionOutOfBound(arr);
		ExceptionNullPointer();
	}
}
