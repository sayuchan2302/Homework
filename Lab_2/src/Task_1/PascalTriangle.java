package Task_1;

public class PascalTriangle {

	public static void printPascalTriangle(int rows) {
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(getPascalValue(i, j) + " ");
			}
			System.out.println();
		}
	}

	public static int getPascalValue(int row, int column) {
		if (column == 0 || column == row) {
			return 1;
		} else {
			return getPascalValue(row - 1, column - 1) + getPascalValue(row - 1, column);
		}
	}

	public static void main(String[] args) {
		int n = 5; // Change this to the desired number of rows
		printPascalTriangle(n);
	}
}