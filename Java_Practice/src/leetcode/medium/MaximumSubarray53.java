package leetcode.medium;

/**
 * LeetCode Problems
 * 
 * 53. Maximum Subarray Solution 1 </br>
 * {@link} https://leetcode.com/problems/maximum-subarray/
 * 
 * @author Amit Das
 */
public class MaximumSubarray53 {

	public int maxSubArray(int[] nums) {
		int maxSum = Integer.MIN_VALUE;
		int arrayLen = nums.length;
		if (arrayLen > 0) {
			if (arrayLen == 1) {
				return nums[0];
			} else {
				for (int i = 0; i < arrayLen; i++) {
					int j = i + 1;
					int currSum = nums[i];
					if (currSum > maxSum) {
						maxSum = currSum;
					}
					while (j < arrayLen) {
						currSum = currSum + nums[j];
						if (currSum > maxSum) {
							maxSum = currSum;
						}
						j++;
					}
				}
			}
		}
		return maxSum;
	}

	public static void main(String[] args) {
		// Might not work for Big Input
		MaximumSubarray53 t = new MaximumSubarray53();
		System.out.println(t.maxSubArray(new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 })); // 6
		System.out.println(t.maxSubArray(new int[] { 1 })); // 1
		System.out.println(t.maxSubArray(new int[] { 5, 4, -1, 7, 8 })); // 23
		System.out.println(t.maxSubArray(new int[] { -2, 1 })); // 1
		System.out.println(t.maxSubArray(new int[] { -2, -3, -1 })); // -1
		System.out.println(t.maxSubArray(new int[] { -1, -1, -2, -2 })); // -1
		System.out.println(t.maxSubArray(new int[] { -1, -2 })); // -1
	}
}