package Task_1;

public class Task1_4 {
	// tranpose a matrix
	public static int[][] transpose(int[][] a) {
		// TODO
		int[][] result = new int[a[0].length][a.length];
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[0].length; j++) {
				result[i][j] = a[j][i];
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
		int array[][] = { { 3, 6, 9, 1 }, { 1, 3, 6, 9 }, { 6, 3, 6, 0 } };
		int trans[][] = transpose(array);
		prinMatrix(trans);
	}
}
