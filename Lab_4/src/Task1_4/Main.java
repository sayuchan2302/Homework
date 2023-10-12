package Task1_4;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Product p1 = new Product("01", "snack", 5000, "fastfood");
		Product p2 = new Product("02", "snack", 5000, "fastfood");
		Product p3 = new Product("03", "banana", 4000, "fruit");
		Product p4 = new Product("04", "orange", 7000, "fruit");
		OrderItem o1 = new OrderItem(p1, 4);
		OrderItem o2 = new OrderItem(p2, 3);
		OrderItem o3 = new OrderItem(p3, 5);
		OrderItem o4 = new OrderItem(p4, 7);
		OrderItem list[] = { o1, o2, o3, o4 };
		Order listOrder = new Order(list);
		System.out.println(Arrays.toString(listOrder.getItems()));
		listOrder.MergeSort();
		System.out.println("==========================");
		System.out.println(Arrays.toString(listOrder.getItems()));
	}
}
