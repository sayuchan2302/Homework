
public class Test {
	public static void main(String[] args) {
		BST<Integer> bst = new BST<>();

		// Thêm các phần tử vào BST
		bst.add(5);
		bst.add(3);
		bst.add(7);
		bst.add(1);
//		bst.add(4);
//		bst.add(6);
//		bst.add(8);
//
//		// Hiển thị cây BST sau khi thêm
//		System.out.println("Cay BST sau khi them:");
//		printBST(bst.getRoot());
//	}
//
//	// Hàm in cây BST theo thứ tự trung tố (in-order traversal)
//	public static void printBST(BNode<?> node) {
//		if (node != null) {
//			printBST(node.getLeft());
//			System.out.print(node.getData() + " ");
//			printBST(node.getRight());
//		}
	}
}
