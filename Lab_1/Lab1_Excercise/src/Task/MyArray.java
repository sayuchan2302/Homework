package Task;

import java.util.Arrays;

public class MyArray {
	private int[] array;

	public MyArray(int[] array) {
		this.array = array;
	}

	// task 1.1
	public int[] mirror() {
		int result[] = new int[this.array.length * 2];
		for (int i = 0; i < array.length; i++) {
			result[i] = array[i];
			result[array.length * 2 - i - 1] = array[i];
		}
		return result;
	}

	// task 1.2
	public int[] removeDuplicates() {
		int n = this.array.length;
		int count = 0;
		int[] result = new int[n];
		for (int i = 0; i < n; i++) {
			boolean isDup = false; // check Duplicates element of Array
			for (int j = 0; j < i; j++) {
				if (array[i] == array[j]) {
					isDup = true;
					break;
				}
			}
			if (!isDup) {
				result[count] = array[i];
				count++;
			}

		}
		return Arrays.copyOf(result, count); // trả về đúng size của mảng

	}

	public int[] getMissingValues() {
		// lấy giá trị đầu cuối
		int min = array[0];
		int max = array[array.length - 1];
		int missCount = 0; // biến đếm số lần miss
		for (int i = min; i < max; i++) {
			boolean found = false; // kiểm tra miss
			for (int j = 0; j < array.length; j++) {
				if (array[j] == i) {
					found = true;
					break;
				}
			}
			// nếu miss biến đếm tăng lên
			if (!found) {
				missCount++;
			}
		}
		int[] result = new int[missCount];
		int index = 0;
		for (int i = min; i < max; i++) {
			boolean found = false;
			for (int j = 0; j < array.length; j++) {
				if (array[j] == i) {
					found = true;
					break;
				}
			}
			if (!found) {
				result[index] = i;
				index++;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int[] arr1 = { 7, 8, 9 };
		MyArray m1 = new MyArray(arr1);
		System.out.println("Input: " + Arrays.toString(arr1));
		System.out.println("Output: " + Arrays.toString(m1.mirror()));
		System.out.println("-----------------------------");
		int[] arr2 = { 1, 2, 3, 3, 6, 1, 9 };
		MyArray m2 = new MyArray(arr2);
		System.out.println("Input: " + Arrays.toString(arr2));
		System.out.println("Output: " + Arrays.toString(m2.removeDuplicates()));
//		System.out.println(m2.removeDuplicates().length);
		System.out.println("-----------------------------");
		int[] arr3 = { 10, 11, 12, 13, 14, 16, 17, 19, 20 };
		MyArray m3 = new MyArray(arr3);
		System.out.println("Input: " + Arrays.toString(arr3));
		System.out.println(Arrays.toString(m3.getMissingValues()));

	}
}
