package Task_2;

public class Pattern_5 {
	public static void pattern_5(int n) {
		helper(n, 1);
	}

	public static void helper(int n, int row) {
		if (n <= 0)
			return;
		printWhiteSpace(n - 1 );
		printData1(row , n-1);
		printData2(row - 1 ,n-1);
		System.out.println();
		helper(n - 1, row + 1);
	}

	public static void printWhiteSpace(int count ) {
		if (count <= 0)
			return;
		System.out.print(" ");
		printWhiteSpace(count - 1);
	}

	public static void printData1(int count , int data) {
		if (count <= 0)
			return;
		printData1(count - 1 , data);
		System.out.print(data+count);
	}
	public static void printData2(int count , int data) {
		if (count <= 0)
			return;
		System.out.print(data+count);
		printData1(count - 1 , data);
	}
	

	public static void main(String[] args) {
		pattern_5(5);
	}
}
