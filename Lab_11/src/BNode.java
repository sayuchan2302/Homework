
public class BNode<E extends Comparable<E>> {
	private E data;
	private BNode<E> left;
	private BNode<E> right;

	public BNode(E data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}

	public BNode(E data, BNode<E> left, BNode<E> right) {
		super();
		this.data = data;
		this.left = left;
		this.right = right;
	}

	public E getData() {
		return data;
	}

	public BNode<E> getLeft() {
		return left;
	}

	public BNode<E> getRight() {
		return right;
	}

	public void setData(E data) {
		this.data = data;
	}

	public void setLeft(BNode<E> left) {
		this.left = left;
	}

	public void setRight(BNode<E> right) {
		this.right = right;
	}

	// left - node - right
	// display BST using inorder approach
	public void inorder() {
		if (left != null) {
			left.inorder();
		}
		System.out.print(data + " ");
		if (right != null) {
			right.inorder();
		}
	}

	// Node - left - right
	public void preorder() {
		System.out.print(data + " ");
		if (left != null) {
			left.preorder();
		}
		if (right != null) {
			right.preorder();
		}
	}

	// left - right-Node
	// display BST using postorder approach
	public void postorder() {
		if (left != null) {
			left.postorder();
		}
		if (right != null) {
			right.postorder();
		}
		System.out.print(data + " ");
	}
}
