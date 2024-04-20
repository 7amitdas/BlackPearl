package algoexpert.easy;

/**
 * Coding Interview Questions </br>
 * Binary Search Solution 1 </br>
 * {@link} https://www.algoexpert.io/questions/binary-search
 * 
 * @author Amit Das
 */
public class BinarySearch {

	public static int binarySearch(int[] array, int target) {
		// Write your code here.
		int low = 0;
		int high = array.length - 1;

		while (low <= high) {
			int mid = (low + high) / 2;
			int midVal = array[mid];

			if (midVal < target)
				low = mid + 1;
			else if (midVal > target)
				high = mid - 1;
			else
				return mid;
		}
		return -1;
	}

	public static void main(String[] args) {
		System.out.println(BinarySearch.binarySearch(new int[] { 0, 1, 21, 33, 45, 45, 61, 71, 72, 73 }, 33));
	}
}