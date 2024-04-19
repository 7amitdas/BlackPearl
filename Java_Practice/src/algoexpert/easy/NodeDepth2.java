package algoexpert.easy;

import java.util.ArrayDeque;

/**
 * Coding Interview Questions Node Depths Solution 2 (Iterative Approach)
 * {@link} https://www.algoexpert.io/questions/node-depths
 * 
 * @author Amit Das
 */
public class NodeDepth2 {

	public static int nodeDepths(BinaryTree root) {
		// Write your code here.
		int totalNodeDepth = 0;
		ArrayDeque<BinaryTreeDepth> stack = new ArrayDeque<>();
		stack.add(new BinaryTreeDepth(root, 0));
		while (!stack.isEmpty()) {
			BinaryTreeDepth curr = stack.pop();
			if (curr.tree == null) {
				continue;
			}
			totalNodeDepth += curr.nodeDepth;
			stack.add(new BinaryTreeDepth(curr.tree.left, curr.nodeDepth + 1));
			stack.add(new BinaryTreeDepth(curr.tree.right, curr.nodeDepth + 1));
		}
		return totalNodeDepth;
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

	static class BinaryTreeDepth {
		BinaryTree tree;
		int nodeDepth;

		public BinaryTreeDepth(BinaryTree currTree, int currNodeDepth) {
			this.tree = currTree;
			this.nodeDepth = currNodeDepth;
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
	}
}