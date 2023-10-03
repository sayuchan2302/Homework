package Task_2;

public class Order {
	private OrderItem[] items;

	public double cost() {
		// TODO
		int sumCostList = 0;
		for (OrderItem item : items) {
			sumCostList += item.priceItem();
		}
		return sumCostList;
	}

	// using binary search approach
	public boolean contains(Product p) {
		// TODO
		return binarySearch(p, 0, items.length - 1);
	}

	public boolean binarySearch(Product p, int left, int right) {
		if (right < left)
			return false;
		int mid = (left + right) / 2;
		if (items[mid].priceItem() < p.getPrice()) {
			return binarySearch(p, left, mid - 1);
		} else {
			return binarySearch(p, mid + 1, right);
		}
	}

	// get all products based on the given type using linear search
	public Product[] filter(String type) {
		// TODO
		int count = 0;
		for (OrderItem item : items) {
			if (item.typeItem().equals(type)) {
				count++;
			}
		}
		Product[] result = new Product[count];
		int index = 0;
		for (OrderItem item : items) {
			if (item.typeItem().equals(type)) {
				result[index] = item.getP();
			}
		}
		return result;
	}
}
