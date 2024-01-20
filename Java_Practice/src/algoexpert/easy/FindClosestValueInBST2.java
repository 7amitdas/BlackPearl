package algoexpert.easy;

/**
 * Coding Interview Questions Find Closest Value in BST
 * {@link} https://www.algoexpert.io/questions/find-closest-value-in-bst
 * 
 * @author Amit Das
 */
public class FindClosestValueInBST2 {

	static class BST {
		public int value;
		public BST left;
		public BST right;

		public BST(int value) {
			this.value = value;
		}
	}

	public static int findClosestValueInBst(BST tree, int target) {
		// Write your code here.
		int closestNode = tree.value;
		int closestGapValue = Integer.MAX_VALUE;
		while (tree != null) {
			int gap = Math.abs(target - tree.value);
			if (gap < closestGapValue) {
				closestNode = tree.value;
				closestGapValue = gap;
			}
			if (target < tree.value) {
				tree = tree.left;
			} else if (target > tree.value) {
				tree = tree.right;
			} else {
				break;
			}
		}
		return closestNode;
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