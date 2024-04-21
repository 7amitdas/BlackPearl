package leetcode.easy;

/**
 * Coding Interview Questions </br>
 * Maximum Depth of Binary Tree Solution 1 </br>
 * {@link} https://leetcode.com/problems/maximum-depth-of-binary-tree
 * 
 * @author Amit Das
 */
public class MaximumDepthOfBinaryTree2 {

	public int maxDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}
		int leftHeight = maxDepth(root.left);
		int rightHeight = maxDepth(root.right);
		return Math.max(leftHeight, rightHeight) + 1;
	}

	public static void main(String[] args) {
		TreeNode r3l = new TreeNode(15);
		TreeNode r3r = new TreeNode(7);
		TreeNode r2r = new TreeNode(20, r3l, r3r);
		TreeNode l2l = new TreeNode(9);
		TreeNode rootWValues = new TreeNode(3, l2l, r2r);

		MaximumDepthOfBinaryTree2 m1 = new MaximumDepthOfBinaryTree2();
		System.out.println(m1.maxDepth(rootWValues)); // 3

		TreeNode rootWValues1 = new TreeNode(1, new TreeNode(2), null);
		MaximumDepthOfBinaryTree2 m2 = new MaximumDepthOfBinaryTree2();
		System.out.println(m2.maxDepth(rootWValues1)); // 2
	}
}
