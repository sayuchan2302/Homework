package Task2.x;

import java.util.Arrays;

public class QuickSort {
	public static void quickSort(int arr[]) {
		helper(arr, 0, arr.length - 1);
	}

	public static void helper(int arr[], int left, int right) {
		if (left >= right) {
			return;
		} else {
			// select mid is pivot
			int pivot = (left + right) / 2;
			int indexSorted  = partition(arr, left, right, pivot);
			helper(arr, left, indexSorted - 1);
			helper(arr, indexSorted+1, right);
		}
	}

	public static int partition(int arr[], int leftIndex, int rightIndex, int pivot) {
		while (leftIndex <= rightIndex) {
			while (arr[leftIndex] < arr[pivot]) {
				leftIndex++;

			}
			while (arr[rightIndex] > arr[pivot]) {
				rightIndex--;
			}
			if (leftIndex <= rightIndex) {
				int temp = arr[leftIndex];
				arr[leftIndex] = arr[rightIndex];
				arr[rightIndex] = temp;
				leftIndex ++ ;
				rightIndex --;
			}
		}
		return leftIndex;
	}

	public static void main(String[] args) {
		int arr[] = { 6, 8, 0, 5, 10, 5, 6, 10 };
		System.out.println("Input: " + Arrays.toString(arr));
		quickSort(arr);
		System.out.println("Output: " + Arrays.toString(arr));
	}
}
