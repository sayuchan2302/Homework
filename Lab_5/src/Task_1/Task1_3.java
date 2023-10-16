package Task_1;

public class Task1_3 {
	// multiply 2 matrices
	public static int[][] multiply(int[][] a, int[][] b) {
		int aRows = a.length;
		int aCols = a[0].length;
		int bCols = b[0].length;
		int[][] result = new int[aRows][bCols];

		for (int i = 0; i < aRows; i++) {
			for (int j = 0; j < bCols; j++) {
				result[i][j] = 0;
				for (int k = 0; k < aCols; k++) {
					result[i][j] += a[i][k] * b[k][j];
				}
			}
		}
		return result;
	}

	public static void printMatrix(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int a[][] = { { 1, 2, 6 }, { 9, 6, 3 }, { 5, 6, 9 } };
		int b[][] = { { 0, 3, 9 }, { 6, 0, 8 }, { 0, 4, 3 } };
		int resultMultiply[][] = multiply(a, b);
		printMatrix(resultMultiply);
	}
}