package Task2.x;

import java.util.Random;

public class Task2_2 {

	public static void quickSort(int[] array) {
		if (array == null || array.length <= 1) {
			return; // No need to sort
		}
		quickSort(array, 0, array.length - 1);
	}

	private static void quickSort(int[] array, int low, int high) {
		if (low < high) {
			// Choose the pivot based on the selected strategy
			int pivotIndex = getPivot_MedianOfThree(array, low, high);

			// Partition the array into two halves
			int partitionIndex = partition(array, low, high, pivotIndex);

			// Recursively sort the subarrays
			quickSort(array, low, partitionIndex - 1);
			quickSort(array, partitionIndex + 1, high);
		}
	}

	// Select pivot element based on the median of three
	private static int getPivot_MedianOfThree(int[] array, int low, int high) {
		int mid = (low + high) / 2;

		// Find the median of the three elements: array[low], array[mid], array[high]
		if (array[low] > array[mid]) {
			swap(array, low, mid);
		}
		if (array[low] > array[high]) {
			swap(array, low, high);
		}
		if (array[mid] > array[high]) {
			swap(array, mid, high);
		}

		return mid; // Return the index of the median element
	}

	// Select pivot element based on the first element in the array
	private static int getPivot_First(int[] array, int low, int high) {
		return low; // Use the first element as the pivot
	}

	// Select pivot element based on the last element in the array
	private static int getPivot_Last(int[] array, int low, int high) {
		return high; // Use the last element as the pivot
	}

	// Select pivot element based on choosing a randomly element in the array
	private static int getPivot_Random(int[] array, int low, int high) {
		Random rand = new Random();
		return rand.nextInt(high - low + 1) + low; // Random pivot within the range [low, high]
	}

	private static int partition(int[] array, int low, int high, int pivotIndex) {
		int pivotValue = array[pivotIndex];
		swap(array, pivotIndex, high); // Move the pivot to the end

		int i = low;
		for (int j = low; j < high; j++) {
			if (array[j] <= pivotValue) {
				swap(array, i, j);
				i++;
			}
		}

		swap(array, i, high); // Move the pivot back to its correct position
		return i;
	}

	private static void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	public static void main(String[] args) {
		int[] array = { 5, 2, 9, 1, 5, 6 };
		quickSort(array);

		for (int num : array) {
			System.out.print(num + " ");
		}
	}
}