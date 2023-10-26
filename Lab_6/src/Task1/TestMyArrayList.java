package Task1;

import java.util.Arrays;
import java.util.Comparator;

public class TestMyArrayList {
	public static void printArrayList(MyArrayList<Integer> list) {
		if (list.size() == 0) {
			System.out.println("Array is null !");
		}
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		MyArrayList<Integer> list = new MyArrayList<Integer>(3);

		System.out.println("Empty: " + list.isEmpty());
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.print("Add Value:");
		printArrayList(list);

		System.out.println("Size of list: " + list.size());
		System.out.print("elements of arr: ");
		printArrayList(list);
		System.out.println("get value index 2 : " + list.get(2));
		list.set(0, 0);
		System.out.print("set value index 0 -> 0: ");
		printArrayList(list);
		list.add(1, 1);
		System.out.println("add element 1 of index 1 : ");
		printArrayList(list);
		System.out.println("Remove element of index 3 :");
		list.remove(3);
		printArrayList(list);
		list.clear();
		printArrayList(list);
		list.lastIndexOf(4);
		System.out.println("last intdex of 4: " + list.lastIndexOf(4)); // null
		list.add(1);
		list.add(2);
		list.add(3);
		list.lastIndexOf(4);
		System.out.println("last intdex of 3: " + list.lastIndexOf(3));
		System.out.print(list.contains(3));
		System.out.print(" index of -> ");
		System.out.println(list.indexOf(3));
		System.out.print("remove value 1: ");
		list.removeElement(1);
		printArrayList(list);
		list.add(0);
		System.out.println(list.size());;
		System.out.println("Array: " + Arrays.toString(list.toArray()));
		 list.sort(Comparator.comparingInt(o -> o));
	        System.out.println("Sort: " + Arrays.toString(list.toArray()));
	}
}
