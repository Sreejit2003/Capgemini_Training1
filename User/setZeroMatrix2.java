package User;

public class setZeroMatrix2 {

	public static void main(String[] args) {
		
		int mat[][] = {{1,1,1}, {1,0,1}, {1,1,1}};
		
		setZeroMatrix(mat);
	}

	public static void setZeroMatrix(int mat[][]) {

		int n = mat.length;
		int m = mat[0].length;


		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {

				if (mat[i][j] == 0) {

					for (int k = 0; k < n; k++) {
						mat[i][k] = 0; // setting rows as zero
						mat[k][j] = 0; // setting columns as zero
					}
				}
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
	}
}
