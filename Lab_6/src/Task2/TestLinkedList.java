package Task2;

public class TestLinkedList {
	public static void main(String[] args) {
		SinglyLinkedList<Integer>list = new SinglyLinkedList<Integer>();
		list.addFirst(0);
		list.addLast(1);
		list.addLast(2);
		list.addLast(3);
		list.printNode();
		list.removeFirst();
		list.printNode();
		list.removeLast();
		list.printNode();
		System.out.println("Value fisrt: "+ list.first());
		System.out.println("Value last: "+ list.last());
	}
}
