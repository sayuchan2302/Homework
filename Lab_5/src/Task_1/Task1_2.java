package Task_1;

public class Task1_2 {
	public static int[][] subtract(int[][] a, int[][] b) {
		// TODO
		int[][] result = new int[a.length][a[0].length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				result[i][j] = a[i][j] - b[i][j];
			}
		}
		return result;
	}

	public static void prinMatrix(int[][] array) {
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
		int resultAdd[][] = subtract(a, b);
		prinMatrix(resultAdd);
	}
}
