package Task1_4;
	// xếp giảm dần theo giá (price )
public class Order {
	private OrderItem[] items;

	public Order(OrderItem[] items) {
		super();
		this.items = items;
	}

	public OrderItem[] getItems() {
		return items;
	}

	// descending order
	public void bubbleSort() {
		for (int i = 0; i < items.length - 1; i++) {
			boolean checkSwap = false;
			for (int j = 0; j < items.length - i - 1; j++) {
				if (items[j].getP().getPrice() < items[j + 1].getP().getPrice()) {
					OrderItem temp = items[j];
					items[j] = items[j + 1];
					items[j + 1] = temp;
					checkSwap = true;
				}
			}
			if (!checkSwap)
				break;
		}
	}

	// descending order
	public void selectionSort() {
		helper(0);
	}

	public void helper(int start) {
		if (start >= items.length - 1)
			return;
		int maxIndex = start;
		for (int i = start + 1; i < items.length; i++) {
			if (items[i].getP().getPrice() > items[maxIndex].getP().getPrice()) {
				maxIndex = i;
			}
		}
		OrderItem temp = items[start];
		items[start] = items[maxIndex];
		items[maxIndex] = temp;
		helper(start + 1);
	}

	// descending order using insertsort
	public void insertionSort() {
		for (int i = 1; i < items.length; i++) {
			OrderItem key = items[i];
			int j = i - 1;
			while (j >= 0 && items[j].getP().getPrice() < key.getP().getPrice()) {
				items[j + 1] = items[j];
				j--;
			}
			items[j + 1] = key;
		}
	}

	public void quickSort() {
		quickSortHelper(0, items.length - 1);
	}

	public void quickSortHelper(int left, int right) {
		if (left > right)
			return;
		OrderItem pivot = items[(left + right) / 2];
		int pivotIndex = partitions(left, right, pivot);
		quickSortHelper(left, pivotIndex - 1);
		quickSortHelper(pivotIndex, right);

	}

	public int partitions(int left, int right, OrderItem pivot) {
		while (left < right) {
			while (items[left].getP().getPrice() > pivot.getP().getPrice()) {
				left++;
			}
			while (items[right].getP().getPrice() < pivot.getP().getPrice()) {
				right--;
			}
			if (left < right) {
				OrderItem temp = items[left];
				items[left] = items[right];
				items[right] = temp;
				left++;
				right--;
			}
		}
		return left;
	}

//	public void MergeSort() {
//		helperMergeSort(0, items.length - 1);
//	}
//
//	public OrderItem[] helperMergeSort(int left, int right) {
//		if (left == right) {
//			OrderItem[] singleItem = new OrderItem[1];
//			singleItem[0] = items[left];
//			return singleItem;
//		}
//		int mid = (left + right) / 2;
//		OrderItem arrayLeft[] = helperMergeSort(left, mid);
//		OrderItem arrayRight[] = helperMergeSort(mid + 1, right); // Fix the recursive call here
//		OrderItem[] result = mergeTwoArray(arrayLeft, arrayRight);
//		return result;
//	}
//
//	public OrderItem[] mergeTwoArray(OrderItem[] left, OrderItem[] right) {
//		int p1 = 0, p2 = 0, p3 = 0;
//		OrderItem[] resMerge = new OrderItem[left.length + right.length];
//		while (p1 < left.length && p2 < right.length) {
//			if (left[p1].getP().getPrice() > right[p2].getP().getPrice()) {
//				resMerge[p3] = left[p1];
//				p1++;
//				p3++;
//			} else {
//				resMerge[p3] = right[p2];
//				p2++;
//				p3++;
//			}
//		}
//		while (p1 < left.length) {
//			resMerge[p3] = left[p1];
//			p1++;
//			p3++;
//
//		}
//		while (p2 < right.length) {
//			resMerge[p3] = right[p2];
//			p2++;
//			p3++;
//		}
//		return resMerge;
//	}
	public void MergeSort() {
		items = helperMergeSort(0, items.length - 1);
	}

	public OrderItem[] helperMergeSort(int left, int right) {
		if (left == right) {
			OrderItem[] singleItem = new OrderItem[1];
			singleItem[0] = items[left];
			return singleItem;
		}
		int mid = (left + right) / 2;
		OrderItem[] arrayLeft = helperMergeSort(left, mid);
		OrderItem[] arrayRight = helperMergeSort(mid + 1, right);
		return mergeTwoArray(arrayLeft, arrayRight);
	}

	public OrderItem[] mergeTwoArray(OrderItem[] left, OrderItem[] right) {
		int p1 = 0, p2 = 0, p3 = 0;
		OrderItem[] resMerge = new OrderItem[left.length + right.length];
		while (p1 < left.length && p2 < right.length) {
			if (left[p1].getP().getPrice() >= right[p2].getP().getPrice()) {
				resMerge[p3] = left[p1];
				p1++;
			} else {
				resMerge[p3] = right[p2];
				p2++;
			}
			p3++;
		}

		while (p1 < left.length) {
			resMerge[p3] = left[p1];
			p1++;
			p3++;
		}

		while (p2 < right.length) {
			resMerge[p3] = right[p2];
			p2++;
			p3++;
		}

		return resMerge;
	}
}
