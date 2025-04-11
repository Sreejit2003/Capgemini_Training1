package User;

public class Matrix1 {
	
	static void print(int arr[][]) {
		int row = arr.length;
		int col = arr[0].length;
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
	
	 static void revrows(int arr[][]) {
		
		transpose(arr);
		
		int row = arr.length;
		int col = arr[0].length;
		int temp;
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<row/2; j++) {
				temp = arr[i][j];
				arr[i][j] = arr[i][row - j -1];
				arr[i][row - j -1] = temp;
			}
		}
		
	}
	
	 static void transpose(int arr[][]) {
		int row = arr.length;
		int col = arr[0].length;
		int temp;
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				temp = arr[j][i];
				arr[j][i] = arr[i][j];
				arr[i][j] = temp;
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } }; 
		transpose(arr);
		revrows(arr);
		print(arr);
	}
}
