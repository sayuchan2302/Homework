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
		int[] a = { 6, 1,3, 2, 7 };
		insertionSortRecursive(a);
		System.out.println(Arrays.toString(a));
	}
}
