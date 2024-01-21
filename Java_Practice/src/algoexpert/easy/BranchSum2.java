package algoexpert.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Coding Interview Questions </br>
 * Branch Sums Solution 2 </br>
 * {@link} https://www.algoexpert.io/questions/branch-sums
 * 
 * @author Amit Das
 */
public class BranchSum2 {

	public static class BinaryTree {
		int value;
		BinaryTree left;
		BinaryTree right;

		BinaryTree(int value) {
			this.value = value;
			this.left = null;
			this.right = null;
		}
	}

	static class BranchSums {
		private BinaryTree tree;
		private int sum = 0;

		BranchSums(BinaryTree tree, int sum) {
			this.tree = tree;
			this.sum = sum;
		}
	}

	public static List<Integer> branchSums(BinaryTree root) {
		// Write your code here.
		Stack<BranchSums> nodes = new Stack<>();
		List<Integer> sumsList = new ArrayList<>();
		nodes.push(new BranchSums(root, root.value));

		while (!nodes.isEmpty()) {
			BranchSums current = nodes.pop();
			if (current.tree.left == null && current.tree.right == null) {
				sumsList.add(current.sum);
			}
			if (current.tree.right != null) {
				nodes.push(new BranchSums(current.tree.right, current.sum + current.tree.right.value));
			}
			if (current.tree.left != null) {
				nodes.push(new BranchSums(current.tree.left, current.sum + current.tree.left.value));
			}
		}
		return sumsList;
	}

	public static void main(String[] args) {
		BinaryTree root = new BinaryTree(10);
		BinaryTree l1l = new BinaryTree(5);
		BinaryTree l2l = new BinaryTree(2);
		l2l.left = new BinaryTree(1);
		l1l.left = l2l;
		l1l.right = new BinaryTree(5);
		BinaryTree r1r = new BinaryTree(15);
		BinaryTree r2l = new BinaryTree(13);
		r2l.right = new BinaryTree(14);
		r1r.left = r2l;
		r1r.right = new BinaryTree(22);
		root.left = l1l;
		root.right = r1r;
		System.out.println(branchSums(root));
	}
}