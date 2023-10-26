package Task2;

import java.net.SecureCacheResponse;
import java.util.NoSuchElementException;

public class SinglyLinkedList<E> {
	private Node<E> head = null;
	private Node<E> tail = null;
	private int size;

	public SinglyLinkedList() {
		super();
	}

	// Returns the number of elements in the list.
	public int size() {
		return this.size;
	}

	// Returns true if the list is empty, and false otherwise.
	public boolean isEmpty() {
		return head == null;
	}

	// Returns (but does not remove) the first element in the list.

	public E first() {
		if (isEmpty()) {
			return null;
		} else {
			return head.getData();
		}

	}

	// Returns (but does not remove) the last element in the list.
	public E last() {
		if (isEmpty()) {
			return null;

		} else {
			Node<E> cur = head;
			while (cur.getNext() != null) {
				cur = cur.getNext();
			}
			return cur.getData();
		}

	}

	// Adds a new element to the front of the list.
	public void addFirst(E e) {
		Node<E> newNode = new Node<>(e);
		if (isEmpty()) {
			head = newNode;
			tail = newNode;

		} else {
			head = newNode;
			newNode.setNext(head);
		}
		size++;
	}

	// Adds a new element to the end of the list.
	public void addLast(E e) {
		Node<E> newNode = new Node<>(e);
		if (isEmpty()) {
			head = newNode;
			tail = newNode;
		} else {
			Node<E> cur = head;
			while (cur.getNext() != null) {
				cur = cur.getNext();
			}
			cur.setNext(newNode);
			tail = newNode;

		}
		size++;
	}

	// Removes and returns the first element of the list.
	public E removeFirst() {
		if (isEmpty())
			throw new NoSuchElementException("The list is empty.");
		E temp = head.getData();
		head = head.getNext();
		size--;
		return temp;
	}

	// Removes and returns the last element of the list.
	public E removeLast() {
		if (isEmpty())
			throw new NoSuchElementException("The list is empty.");
		if (size == 1) {
			E temp = head.getData();
			head = null;
			return temp;
		}
		Node<E> cur = head;
		while (cur.getNext().getNext() != null) {
			cur = cur.getNext();
		}
		E temp = cur.getNext().getData();
		cur.setNext(null);

		size--;
		return temp;
	}

	public void printNode() {
		Node<E> current = head;
		while (current != null) {
			if (current.getNext() == null) {
				System.out.print(current.getData());
				break ;
			}else {
				System.out.print(current.getData()+"->");
				current = current.getNext();
			}
		}
		
		System.out.println();
	}
}
