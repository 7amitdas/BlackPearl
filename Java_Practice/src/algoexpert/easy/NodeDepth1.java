package algoexpert.easy;

/**
 * Coding Interview Questions Node Depths Solution 1 (Recursive Approach)
 * {@link} https://www.algoexpert.io/questions/node-depths
 * 
 * @author Amit Das
 */
public class NodeDepth1 {

	private static Integer totalNodeDepth = 0;

	public static int nodeDepths(BinaryTree root) {
		// Write your code here.
		traverseTree(root, totalNodeDepth);
		return totalNodeDepth;
	}

	/**
	 * Using global variable
	 */
	public static void traverseTree(BinaryTree tree, Integer currNodeDepth) {
		if (tree != null) {
			totalNodeDepth = totalNodeDepth + currNodeDepth;
			traverseTree(tree.left, currNodeDepth + 1);
			traverseTree(tree.right, currNodeDepth + 1);
		}
	}

	public static int nodeDepths1(BinaryTree root) {
		// Write your code here.
		return traverseTree1(root, 0);
	}

	/**
	 * Using Local Variables
	 */
	public static Integer traverseTree1(BinaryTree tree, Integer currNodeDepth) {
		if (tree == null) {
			return 0;
		} else {
			return currNodeDepth + traverseTree1(tree.left, currNodeDepth + 1)
					+ traverseTree1(tree.right, currNodeDepth + 1);
		}
	}

	static class BinaryTree {
		int value;
		BinaryTree left;
		BinaryTree right;

		public BinaryTree(int value) {
			this.value = value;
			left = null;
			right = null;
		}
	}

	public static void main(String[] args) {
		BinaryTree l2l = new BinaryTree(4);
		l2l.left = new BinaryTree(8);
		l2l.right = new BinaryTree(9);
		BinaryTree l1l = new BinaryTree(2);
		l1l.left = l2l;
		l1l.right = new BinaryTree(5);
		BinaryTree r1r = new BinaryTree(3);
		r1r.left = new BinaryTree(6);
		r1r.right = new BinaryTree(7);
		BinaryTree rootWValues = new BinaryTree(1);
		rootWValues.left = l1l;
		rootWValues.right = r1r;
		System.out.println(nodeDepths(rootWValues));
		System.out.println(nodeDepths1(rootWValues));
	}
}