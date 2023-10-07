package Task_2;

import java.util.Arrays;

public class Order {
	private OrderItem[] items;

	public Order(OrderItem[] items) {
		super();
		this.items = items;
	}

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

//	public boolean binarySearch(Product p, int left, int right) {
//		if (left > right)
//			return false;
//		int mid = (left + right) / 2;
////		if (items[mid].getP().getId().equals(p.getId()) && items[mid].getP().getName().equals(p.getName())
////				&& items[mid].getP().getPrice() == (p.getPrice()) && items[mid].getP().getType().equals(p.getType()))
////			return true ;
//		if (items[mid].getP().getId().equals(p.getId()))
//			return true;
//		if (items[mid].getP().getId().charAt(0) < (p.getId().charAt(0))) {
//			return binarySearch(p, left, mid - 1);
//		} else {
//			return binarySearch(p, mid + 1, right);
//		}
//	}
	public boolean binarySearch(Product p, int left, int right) {
		if (left <= right) {
			int mid = (right + left) / 2;
			int idComparison = items[mid].getP().getId().compareTo(p.getId());
			if (idComparison == 0) {
				return true;
			} else if (idComparison < 0) {
				return binarySearch(p, mid + 1, right);
			} else {
				return binarySearch(p, left, mid - 1);
			}
		}
		// Product not found
		return false;
	}

	public Product[] filter(String typeOther) {
		int count = 0;
		for (int i = 0; i < items.length; i++) {
			if (items[i].getP().getType().equals(typeOther)) {
				count++;
			}
		}
		Product result[] = new Product[count];
		int index = 0;

		for (int i = 0; i < items.length; i++) {
			if (items[i].getP().getType().equals(typeOther)) {
				result[index] = items[i].getP();
				index++;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Product d1 = new Product("01", "ca", 25000, "luong thuc");
		Product d2 = new Product("02", "thit", 50000, "luong thuc");
		Product d3 = new Product("03", "ghe", 100000, "noi that");
		Product d4 = new Product("04", "ban", 150000, "noi that");
		OrderItem o1 = new OrderItem(d1, 3);
		OrderItem o2 = new OrderItem(d2, 4);
		OrderItem o3 = new OrderItem(d3, 5);
		OrderItem o4 = new OrderItem(d4, 6);
		OrderItem orderList[] = { o1, o2, o3, o4 };
		Order order = new Order(orderList);
		System.out.println(order.cost());
		Arrays.sort(orderList);
		Product test1 = new Product("04", "ban", 150000, "noi that");
		Product test2 = new Product("05", "Gao", 8000, "luong thuc");
		System.out.println(order.contains(test1));
		System.out.println(order.contains(test2));
		Product[] p1 = order.filter("noi that");
		System.out.println(Arrays.toString(p1));
	}
}
