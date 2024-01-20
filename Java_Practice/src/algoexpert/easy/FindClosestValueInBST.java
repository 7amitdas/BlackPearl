package algoexpert.easy;

/**
 * Coding Interview Questions Find Closest Value in BST
 * {@link} https://www.algoexpert.io/questions/find-closest-value-in-bst
 * 
 * @author Amit Das
 */
public class FindClosestValueInBST {

	static class BST {
		public int value;
		public BST left;
		public BST right;

		public BST(int value) {
			this.value = value;
		}
	}

	public static int traverse(BST subTree, int target, int closestNode, int closestGapValue) {
		if (target < subTree.value) {
			int gap = Math.abs(Math.abs(subTree.value) - Math.abs(target));
			if (gap < closestGapValue) {
				closestNode = subTree.value;
				closestGapValue = gap;
			}
			if (subTree.left == null) {
				return closestNode;
			} else {
				return traverse(subTree.left, target, closestNode, closestGapValue);
			}
		} else if (target > subTree.value) {
			int gap = Math.abs(Math.abs(target) - Math.abs(subTree.value));
			if (gap < closestGapValue) {
				closestNode = subTree.value;
				closestGapValue = gap;
			}
			if (subTree.right == null) {
				return closestNode;
			} else {
				return traverse(subTree.right, target, closestNode, closestGapValue);
			}
		} else {
			closestNode = subTree.value;
		}
		return closestNode;
	}

	public static int findClosestValueInBst(BST tree, int target) {
		// Write your code here.
		int closestNode = tree.value;
		int closestGapValue = 0;
		if (target == tree.value) {
			return closestNode;
		} else {
			if (target < tree.value) {
				closestGapValue = Math.abs(tree.value) - Math.abs(target);
				return traverse(tree.left, target, closestNode, closestGapValue);
			} else if (target > tree.value) {
				closestGapValue = Math.abs(target) - Math.abs(tree.value);
				return traverse(tree.right, target, closestNode, closestGapValue);
			}
			return closestNode;
		}
	}

	public static void main(String[] args) {
		BST rootWValues = new BST(10);
		BST l1l = new BST(5);
		BST l2l = new BST(2);
		l2l.left = new BST(1);
		l1l.left = l2l;
		l1l.right = new BST(5);
		BST r1r = new BST(15);
		BST r2l = new BST(13);
		r2l.right = new BST(14);
		r1r.left = r2l;
		r1r.right = new BST(22);
		rootWValues.left = l1l;
		rootWValues.right = r1r;
		System.out.println(findClosestValueInBst(rootWValues, 12));
	}
}