package Task1.x;

import java.util.Arrays;

public class Task1_3 {
	public static void insertionSort(int arr[]) {
		for (int i = 1; i < arr.length; i++) {
			int key = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}
	}

	public static void insertionSortRecursive(int arr[]) {
		insertionSortHelper(arr, arr.length);
	}

	public static void insertionSortHelper(int arr[], int n) {
		if (n <= 1)
			return;
		insertionSortHelper(arr, n - 1);
		int last = arr[n - 1];
		int j = n - 2;
		while (j >= 0 && arr[j] > last) {
			arr[j + 1] = arr[j];
			j--;
		}
		arr[j + 1] = last;

	}

	public static void main(String[] args) {
		int array1[] = { 8, 9, 2, 1, 6, 0, 88 };
		System.out.println("Input" + Arrays.toString(array1));
		insertionSort(array1);
		System.out.println("Output" + Arrays.toString(array1));
		System.out.println("=================================");
		int array2[] = { 5, 36, 4, 0, 6, 91, 2, 11 };
		System.out.println("Input" + Arrays.toString(array2));
		insertionSortRecursive(array2);
		System.out.println("Output" + Arrays.toString(array2));
	}
}
