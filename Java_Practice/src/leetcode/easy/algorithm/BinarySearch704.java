package leetcode.easy.algorithm;

/**
 * LeetCode Problems Algorithms
 * 
 * Binary Search {@link} https://leetcode.com/problems/binary-search/
 * 
 * @author Amit Das
 */
public class BinarySearch704 {

	public int search(int[] nums, int target) {
		int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int midVal = nums[mid];

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
		BinarySearch704 b = new BinarySearch704();
		System.out.println(b.search(new int[] { -1, 0, 3, 5, 9, 12 }, 2));
	}
}