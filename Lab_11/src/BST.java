
public class BST<E extends Comparable<E>> {
	private BNode<E> root;

	public BST() {
		this.root = null;
	}

	public BNode<E> getRoot() {
		return root;
	}

	public void add(E e) {
		BNode<E> value = new BNode<>(e);
		if (root == null) {
			root = value;
			System.out.println("add val to root");
		} else {
			BNode<E> temp = root;
			while (true) {
				if (e.compareTo(temp.getData()) > 0) {
					if (temp.getRight() == null) {
						System.out.println("add val to right " + temp.getData());
						temp.setRight(value);
						break;
					} else {
						temp = temp.getRight();
					}
				} else {
					if (temp.getLeft() == null) {
						System.out.println("add val to left " + temp.getData());
						temp.setLeft(value);
						break;
					} else {
						temp = temp.getLeft();

					}
				}
			}
		}

	}

//	private void addRecursive (BNode<E> current , E e){
//		if (current == null) {
//		}
//		if (e.compareTo(current.getData()) >0) {
//			if (current.getRight() == null) {
//				current.setRight(e);
//			}
//			addRecursive(current.getRight(), e);
//		}else {
//			addRecursive(current.getLeft(), e);
//		}
//	}
	public void addUsingRecursive(E e) {
		root = addRecursive(root, e);
	}

	private BNode<E> addRecursive(BNode<E> current, E e) {
		if (current == null) {
			return new BNode<>(e);
		}

		if (e.compareTo(current.getData()) > 0) {
			current.setRight(addRecursive(current.getRight(), e));
		} else if (e.compareTo(current.getData()) < 0) {
			current.setLeft(addRecursive(current.getLeft(), e));
		}

		return current;
	}

}
