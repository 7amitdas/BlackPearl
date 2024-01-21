package algoexpert.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Coding Interview Questions </br>
 * Branch Sums Solution 1 </br>
 * {@link} https://www.algoexpert.io/questions/branch-sums
 * 
 * @author Amit Das
 */
public class BranchSum {

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

	public static void calculateBranchSum(BinaryTree subTree, int sum, List<Integer> sumsList) {
		if (subTree != null) {
			int newSum = sum + subTree.value;
			if (subTree.left == null && subTree.right == null) {
				sumsList.add(newSum);
			}
			calculateBranchSum(subTree.left, newSum, sumsList);
			calculateBranchSum(subTree.right, newSum, sumsList);
		}
	}

	public static List<Integer> branchSums(BinaryTree root) {
		// Write your code here.
		List<Integer> sumsList = new ArrayList<>();
		calculateBranchSum(root, 0, sumsList);
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