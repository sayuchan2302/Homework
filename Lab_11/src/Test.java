import java.util.List;

public class Test {
	public static void main(String[] args) {
		// Tạo một BST và thêm các phần tử
		BST<Integer> bst = new BST<>();
		bst.add(5);
		bst.add(3);
		bst.add(7);
		bst.add(1);
		bst.add(4);
		bst.add(6);
		bst.add(8);

		System.out.println("Inorder traversal:");
		bst.getRoot().inorder();
		System.out.println();

		System.out.println("Preorder traversal:");
		bst.getRoot().preorder();
		System.out.println();

		System.out.println("Postorder traversal:");
		bst.getRoot().postorder();
		System.out.println();

		int depthToFind = 4;
		System.out.println("Depth of " + depthToFind + ": " + bst.depth(depthToFind));

		System.out.println("Height of the tree: " + bst.height());

		System.out.println("Size of the tree: " + bst.size());

		int elementToCheck = 6;
		System.out.println("Contains " + elementToCheck + ": " + bst.contains(elementToCheck));

		System.out.println("Minimum element: " + bst.findMin());
		System.out.println("Maximum element: " + bst.findMax());

		int nodeToFindDescendants = 3;
		List<Integer> descendants = bst.descendants(nodeToFindDescendants);
		System.out.println("Descendants of " + nodeToFindDescendants + ": " + descendants);

		int nodeToFindAncestors = 4;
		List<Integer> ancestors = bst.ancestors(nodeToFindAncestors);
		System.out.println("Ancestors of " + nodeToFindAncestors + ": " + ancestors);
	}
}
