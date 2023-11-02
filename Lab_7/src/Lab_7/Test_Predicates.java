package Lab_7;

import java.util.HashSet;
import java.util.function.Predicate;

public class Test_Predicates {
	public static void main(String[] args) {
		HashSet<Integer> list1 = new HashSet<Integer>();
		Predicate<Integer> preEven = new Even();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		System.out.println("TEST REMOVE: ");
		System.out.println("Before " + list1);
		MyPredicates.remove(list1, preEven);
		System.out.println("After: " + list1);
		System.out.println("========================");
		HashSet<Integer> list2 = new HashSet<Integer>();
		list2.add(1);
		list2.add(2);
		list2.add(3);
		list2.add(4);
		list2.add(5);
		System.out.println("TEST RETAIN");
		System.out.println("Before: " + list2);
		MyPredicates.retain(list2, preEven);
		System.out.println("After: " + list2);
		System.out.println("========================");
		HashSet<Integer> list3 = new HashSet<Integer>();
		list3.add(1);
		list3.add(2);
		list3.add(3);
		list3.add(4);
		list3.add(5);
		System.out.println("TEST COLLECT");
		System.out.println("Before: " + list3);
		System.out.println("After: " + MyPredicates.collect(list3, preEven));
		System.out.println("========================");
		HashSet<Integer> list4 = new HashSet<Integer>();
		list4.add(1);
		list4.add(2);
		list4.add(3);
		list4.add(4);
		list4.add(5);
		System.out.println("TEST FIND");
		System.out.println("FIND: " + list4);
		System.out.println("Index of first : "+MyPredicates.find(list4, preEven));
		

	}
}
