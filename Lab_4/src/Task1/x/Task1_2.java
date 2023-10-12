package Task1.x;

import java.util.Arrays;

public class Task1_2 {
	public static void bubbleSort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			boolean swap = false;
			for (int j = 0; j < array.length - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
					swap = true;
				}
			}
			if (swap == false)
				break;
		}
	}

	// recursive
	public static void bubbleSortRecursive(int[] array) {
		helper(array, array.length);
	}

	public static void helper(int array[], int n) {
		if (n <= 1)
			return;
		int countSwap = 0;
		for (int i = 0; i < n - 1; i++) {
			if (array[i] > array[i + 1]) {
				int temp = array[i];
				array[i] = array[i + 1];
				array[i + 1] = temp;
				countSwap = countSwap + 1;
			}
		}
		if (countSwap == 0)
			return;
		helper(array, --n);
	}

	public static void main(String[] args) {
		int array1[] = { 8, 9, 2, 1, 6, 0, 88 };
		System.out.println("Input" + Arrays.toString(array1));
		bubbleSort(array1);
		System.out.println("Output" + Arrays.toString(array1));
		System.out.println("=================================");
		int array2[] = { 5, 36, 4, 0, 6, 91, 2, 11 };
		System.out.println("Input" + Arrays.toString(array2));
		bubbleSortRecursive(array2);
		System.out.println("Output" + Arrays.toString(array2));
	}
}
