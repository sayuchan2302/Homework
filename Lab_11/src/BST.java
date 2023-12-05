import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BST<E extends Comparable<E>> {
	private BNode<E> root;

	public BST() {
		this.root = null;
	}

	public BNode<E> getRoot() {
		return root;
	}

	// Add element e into BST
	public void add(E e) {
		BNode<E> newValue = new BNode<>(e);
		if (root == null) {
			root = newValue;
			System.out.println("add value to root");
		} else {
			BNode<E> temp = root;
			while (true) {
				if (e.compareTo(temp.getData()) > 0) {
					if (temp.getRight() == null) {
						System.out.println("add value " + e + " to right: " + temp.getData());
						temp.setRight(newValue);
						break;
					} else {
						temp = temp.getRight();
					}
				} else {
					if (temp.getLeft() == null) {
						System.out.println("add value " + e + " to left: " + temp.getData());
						temp.setRight(newValue);
						break;
					} else {
						temp = temp.getLeft();
					}
				}
			}

		}
	}

	// Add a collection of elements col into BST
	public void add(Collection<E> col) {
		// TODO
		for (E e : col) {
			add(e);
		}

	}

	// compute the depth of a node in BST
	public int depth(E node) {
		// TODO
		BNode<E> currentNode = root;
		int currentDepth = 0;
		while (currentNode != null) {
			if (currentNode.getData().equals(node)) {
				return currentDepth;
			} else {
				if (currentNode.getData().compareTo(node) > 0) {
					currentNode = currentNode.getLeft();
				} else {
					currentNode = currentNode.getRight();
				}
			}
			currentDepth++;
		}
		return -1;
	}

	public int depthUsingRecursive(E e) {
		return calcalateDepth(root, e);
	}

	private int calcalateDepth(BNode<E> currentNode, E value) {
		if (currentNode == null) {
			return -1;
		}
		if (currentNode.getData().equals(value)) {
			return 0;
		}

		int leftDepth = calcalateDepth(currentNode.getLeft(), value);
		if (leftDepth != -1) {
			return leftDepth + 1;
		}

		int rightDepth = calcalateDepth(currentNode.getRight(), value);
		if (rightDepth != -1) {
			return rightDepth + 1;
		}

		return -1;
	}

	// compute the height of BST
//	public int height() {
//		// TODO
//		if (root == null) return 0 ;
//		Queue<BNode<E>> queue = new LinkedList<>();
//		queue.add(root);
//		queue.add(null);
//		int depth = 0;
//		while (!queue.isEmpty()) {
//			BNode<E> tmp = queue.peek() ;
//			queue.remove() ;
//			
//			
//			if (tmp== null) {
//				depth ++ ;
//			}
//			if (tmp!=null) {
//				if (tmp.getLeft()!= null) {
//					queue.add(tmp.getLeft());
//				}
//				if (tmp.getRight()!= null) {
//					queue.add(tmp.getRight());
//				}
//			}else if (!queue.isEmpty()) {
//				queue.add(null);
//			}
//		}
//		return depth ;
//	}
	public int height() {
		if (root == null ) return 0 ;
		Queue<BNode<E>> queue = new LinkedList<>();
		queue.add(root);
		int depth = 0;
		
		while (!queue.isEmpty()) {
			
		}
		
		
	}
	// Compute total nodes in BST
	public int size() {
		// TODO
		return -1;
	}

	// Check whether element e is in BST
	public boolean contains(E e) {
		// TODO
		return false;
	}

	// Find the minimum element in BST
	public E findMin() {
		// TODO
		return null;
	}

	// Find the maximum element in BST
	public E findMax() {
		// TODO
		return null;
	}

	// Remove element e from BST
	public boolean remove(E e) {
		// TODO
		return false;
	}

	// get the descendants of a node
	public List<E> descendants(E data) {
		// TODO
		return null;
	}

	// get the ancestors of a node
	public List<E> ancestors(E data) {
		// TODO
		return null;
	}
}
