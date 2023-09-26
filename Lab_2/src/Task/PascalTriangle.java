package Task;

public class PascalTriangle {

    public static void printPascalTriangle(int row) {
        for (int i = 1; i <= row; i++) {
            int[] pascalRow = getPascalTriangle(i);
            for (int j = 0; j < pascalRow.length; j++) {
                System.out.print(pascalRow[j] + " ");
            }
            System.out.println();
        }
    }

    public static int[] getPascalTriangle(int n) {
        if (n == 1) {
            int[] row = {1};
            return row;
        } else {
            int[] prevRow = getPascalTriangle(n - 1);
            int[] nextRow = generateNextRow(prevRow);
            return nextRow;
        }
    }

    public static int[] generateNextRow(int[] prevRow) {
        int length = prevRow.length + 1;
        int[] nextRow = new int[length];
        nextRow[0] = 1;
        nextRow[length - 1] = 1;

        for (int i = 1; i < length - 1; i++) {
            nextRow[i] = prevRow[i - 1] + prevRow[i];
        }

        return nextRow;
    }

    public static void main(String[] args) {
        int n = 5; // Change this to the desired number of rows
        printPascalTriangle(n);
    }
}