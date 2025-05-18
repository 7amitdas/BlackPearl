package leetcode.easy;

/**
 * Coding Interview Questions </br>
 * 3550. Smallest Index With Digit Sum Equal to Index Solution 1 </br>
 * {@link} https://leetcode.com/contest/weekly-contest-450/problems/smallest-index-with-digit-sum-equal-to-index/
 * 
 * @author Amit Das
 */
public class SmallestIndexWithDigitSumEqualToIndex3550 {

	public int smallestIndex(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			int sum = String.valueOf(nums[i]).chars().map(Character::getNumericValue).sum();
			if (sum == i) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		SmallestIndexWithDigitSumEqualToIndex3550 p = new SmallestIndexWithDigitSumEqualToIndex3550();
		System.out.println(p.smallestIndex(new int[] { 1, 10, 11 })); // 1
	}
}