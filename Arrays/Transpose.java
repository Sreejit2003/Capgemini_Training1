package Arrays;

public class Transpose {
	
	public static void matrix(int arr[][]) {
		
		int row = arr.length;
		int col = arr[0].length;
		int newarr[][] = new int [row][col];
		
//		for (int j = 0; j < row; j++) {
//			for (int i = 0; i < col; i++) {
//				newarr[i][j] = arr[i][j];
//			}
//		}
//		for (int j = 0; j < row; j++) {
//			for (int i = 0; i < col; i++) {
//				System.out.print(newarr[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				newarr[i][j] = arr[j][i];
			}
		}
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				System.out.print(newarr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } }; 
		matrix(arr);
	}
}
