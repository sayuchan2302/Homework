package Task_1;

public class Task1_3 {
	private int[] array;

	public Task1_3(int[] array) {
		super();
		this.array = array;
	}

	// task 1.1 - Iterative Linear Search for Descending Order
	public int iterativeLinearSearch(int target) {
		for (int i = 0; i < this.array.length; i++) {
			if (array[i] == target)
				return i;
		}
		return -1;
	}

	// Task 1.1 - Recursive Linear Search for Descending Order
	public int recursiveLinearSearch(int target) {
		return helpertask1_1(target, this.array.length - 1);
	}

	public int helpertask1_1(int target, int index) {
		if (index < 0) {
			return -1; // Target not found
		} else if (array[index] == target) {
			return index; // Target found at current index
		} else {
			return helpertask1_1(target, index - 1); // Recursively search the next index
		}
	}

	// Task 1.2 - Iterative Binary Search for Descending Order
	public int iterativeBinarySearch(int target) {
		int left = 0;
		int right = array.length - 1;
		while (right >= left) {
			int mid = (left + right) / 2;
			if (array[mid] == target) {
				return mid; // Target found at current index
			} else if (array[mid] > target) {
				left = mid + 1; // Target is in the right half of the array
			} else {
				right = mid - 1; // Target is in the left half of the array
			}
		}

		return -1; // Target not found
	}

	// Task 1.2 - Recursive Binary Search for Descending Order
	public int recursiveBinarySearch(int target) {
		return helpertask1_2(0, this.array.length - 1, target);
	}

	public int helpertask1_2(int left, int right, int target) {
		if (right < left)
			return -1;
		int mid = (left + right) / 2;
		if (array[mid] == target) {
			return mid;
		} else if (array[mid] > target) {
			return helpertask1_2(left, mid - 1, target);
		} else {
			return helpertask1_2(mid + 1, right, target);
		}
	}

	public static void main(String[] args) {
		int array[] = { 12, 45, 45, 45, 10, 10, 2 };
		Task1_3 a1 = new Task1_3(array);
		System.out.println(a1.recursiveBinarySearch(45));
	}
}