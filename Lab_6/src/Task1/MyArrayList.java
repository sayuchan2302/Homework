package Task1;

import java.util.Arrays;
import java.util.Comparator;

public class MyArrayList<E> {
	public static final int DEFAULT_CAPACITY = 10;
	private E[] elements;
	private int size;

	public MyArrayList() {
		super();
		this.elements = (E[]) new Object[DEFAULT_CAPACITY];
	}

	public MyArrayList(int capacity) {
		this.elements = (E[]) new Object[capacity];
	}

	// creates an array of double-size if the array of elements is full
	public void growSize() {
		if (this.elements.length == this.size) {
			E[] newArray = (E[]) new Object[this.size * 2];
			System.arraycopy(this.elements, 0, newArray, 0, this.elements.length);
			this.elements = newArray;
		}
	}

	// Returns the number of elements in this list.
	public int size() {
		return this.size;
	}

	// Returns whether the list is empty.
	public boolean isEmpty() {
		return this.size == 0;
	}

	// Returns (but does not remove) the element at index i.
	public E get(int i) throws IndexOutOfBoundsException {
		if (i < 0 || i >= this.elements.length) {
			throw new IndexOutOfBoundsException("Index out of bounds");
		} else {
			return elements[i];
		}
	}

	// Replaces the element at index i with e, and returns the replaced element. ∗/
	public E set(int i, E e) throws IndexOutOfBoundsException {
		if (i < 0 || i >= this.elements.length) {
			throw new IndexOutOfBoundsException("Index out of bounds");
		} else {
			E replacedElement = elements[i];
			elements[i] = e;
			return replacedElement;
		}
	}

	// It is used to append the specified element at the end of a list.

	public boolean add(E e) {
		if (this.elements.length == size) {
			growSize();
		}
		elements[size++] = e;
		return true;
	}

	// Inserts element e to be at index i, shifting all subsequent elements later.
	public void add(int i, E e) throws IndexOutOfBoundsException {
		if (i < 0 || i >= this.elements.length) {
			throw new IndexOutOfBoundsException("Index out of bounds");
		} else {
			if (this.elements.length == size) {
				growSize();
			}
			// Shift elements to the right from i to size - 1
//			for (int j = size; j > i; j--) {
//				elements[j] = elements[j - 1];
//			}
			System.arraycopy(this.elements, i, this.elements, i + 1, this.size);
			elements[i] = e;
			size++;
		}
	}

	// Removes and returns the element at index i, shifting subsequent elements
	// earlier.
	public E remove(int i) throws IndexOutOfBoundsException {
		if (i < 0 || i >= this.elements.length) {
			throw new IndexOutOfBoundsException("Index out of bounds");
		} else {
			E elementRemove = elements[i];
//			for (int j = i; j < this.size - 1; j++) {
//				elements[j] = elements[j + 1];
//			}
			System.arraycopy(this.elements, i + 1, this.elements, i, this.size - i - 1);
			return elementRemove;
		}
	}

	// It is used to clear all elements in the list.
	public void clear() {
		for (int i = 0; i < this.elements.length; i++) {
			elements[i] = null;
		}
		this.size = 0;
	}

	// It is used to return the index in this list of thelast occurrence of the
	// specified element, or -1 if thelist does not contain this element.
	public int lastIndexOf(Object o) {
		for (int i = size - 1; i >= 0; i--) {
			if (elements[i].equals(o)) {
				return 1;
			}
		}
		return -1;
	}

	// It is used to return an array containing all of the elements in this list in
	// the correct order.
	public E[] toArray() {
		E[] arr = (E[]) new Object[this.size];
		for (int i = 0; i < this.size; i++) {
			arr[i] = elements[i];
		}
		return arr;
	}

	// It is used to return a shallow copy of an ArrayList.
	public MyArrayList<E> clone() {

		return null;
	}

	// It returns true if the list contains the specified element
	public boolean contains(E o) {
		for (int i = 0; i < this.size; i++) {
			if (elements[i].equals(o)) {
				return true;
			}
		}
		return false;
	}

	// It is used to return the index in this list of the first occurrence of the
	// specified element, or -1 if the List does not contain this element.
	public int indexOf(E o) {
		for (int i = 0; i < this.size; i++) {
			if (elements[i].equals(o)) {
				return i;
			}
		}
		return -1;
	}

	// It is used to remove the first occurrence of the specified element.
	public boolean remove(E e) {
		for (int i = 0; i < size; i++) {
			if (elements[i].equals(e)) {
				remove(e);
				return true;

			}
		}
		return false;
	}

	// It is used to sort the elements of the list on the basis of specified
	// comparator.
	public void sort(Comparator<E> c) {

		E[] temp = this.elements.clone();
		Arrays.sort(temp, c);
		System.arraycopy(temp, 0, this.elements, 0, this.size);
	}
}
