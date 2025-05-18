package leetcode.easy;

/**
 * Coding Interview Questions </br>
 * 3550. Smallest Index With Digit Sum Equal to Index Solution 2 </br>
 * {@link} https://leetcode.com/problems/smallest-index-with-digit-sum-equal-to-index/
 * 
 * @author Amit Das
 */
public class SmallestIndexWithDigitSumEqualToIndex3550V2 {

	public int smallestIndex(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			if (getSum(nums[i]) == i) {
				return i;
			}
		}
		return -1;
	}

	private int getSum(int number) {
		int sum = 0;
		while (number > 0) {
			sum = number % 10;
			number = number / 10;
		}
		return sum;
	}

	public static void main(String[] args) {
		SmallestIndexWithDigitSumEqualToIndex3550V2 p = new SmallestIndexWithDigitSumEqualToIndex3550V2();
		System.out.println(p.smallestIndex(new int[] { 1, 3, 2 })); // 2
		System.out.println(p.smallestIndex(new int[] { 1, 10, 11 })); // 1
		System.out.println(p.smallestIndex(new int[] { 1, 2, 3 })); // -1
	}
}