package leetcode.easy;

/**
 * Coding Interview Questions </br>
 * Maximum Depth of Binary Tree Solution 1 </br>
 * {@link} https://leetcode.com/problems/maximum-depth-of-binary-tree
 * 
 * @author Amit Das
 */
public class MaximumDepthOfBinaryTree1 {

	Integer maxDepth = 0;

	public int maxDepth(TreeNode root) {
		if (root != null) {
			maxDepth = maxDepth + 1;
			traverseTree(root, maxDepth);
		}
		return maxDepth;
	}

	public void traverseTree(TreeNode root, int currDepth) {
		if (root != null) {
			if (currDepth > maxDepth) {
				maxDepth = currDepth;
			}
			traverseTree(root.left, currDepth + 1);
			traverseTree(root.right, currDepth + 1);
		}
	}

	public static void main(String[] args) {
		TreeNode r3l = new TreeNode(15);
		TreeNode r3r = new TreeNode(7);
		TreeNode r2r = new TreeNode(20, r3l, r3r);
		TreeNode l2l = new TreeNode(9);
		TreeNode rootWValues = new TreeNode(3, l2l, r2r);

		MaximumDepthOfBinaryTree1 m1 = new MaximumDepthOfBinaryTree1();
		System.out.println(m1.maxDepth(rootWValues)); // 3

		TreeNode rootWValues1 = new TreeNode(1, new TreeNode(2), null);
		MaximumDepthOfBinaryTree1 m2 = new MaximumDepthOfBinaryTree1();
		System.out.println(m2.maxDepth(rootWValues1)); // 2
	}
}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode() {
	}

	TreeNode(int val) {
		this.val = val;
	}

	TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
}