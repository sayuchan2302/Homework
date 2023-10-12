package Task1.x;

import java.util.Arrays;

public class Task1_1 {
	public static void selectionSort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int minIndex = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[minIndex] > array[j]) {
					minIndex = j;
				}
			}
			int temp = array[minIndex];
			array[minIndex] = array[i];
			array[i] = temp;
		}
	}

	// slection sort (using recursive)
	public static void selectionSortRecursive(int[] array) {
		helper(array, 0);
	}

	public static void helper(int[] array, int index) {
		if (index >= array.length)
			return;
		int minIndex = findMinIndex(array, index+1, index);
		int temp = array[minIndex];
		array[minIndex] = array[index];
		array[index] = temp;
		helper(array, index + 1);
	}

	public static int findMinIndex(int array[], int start, int minIndex) {
		if (start == array.length)
			return minIndex;
		if (array[minIndex] > array[start]) {
			minIndex = start;
		}
		return findMinIndex(array, start + 1, minIndex);
	}

	public static void main(String[] args) {
		int array1[] = { 8, 9, 2, 1, 6, 0, 88 };
		System.out.println("Input" + Arrays.toString(array1));
		selectionSort(array1);
		System.out.println("Output" + Arrays.toString(array1));
		System.out.println("=================================");
		int array2[] = { 5, 36, 4, 0, 6, 91, 2, 11 };
		System.out.println("Input" + Arrays.toString(array2));
		selectionSortRecursive(array2);
		System.out.println("Output" + Arrays.toString(array2));
	}
}
