package leetcode.medium;

import java.util.stream.IntStream;

/**
 * LeetCode Problems
 * 
 * 53. Maximum Subarray Solution 2 </br>
 * {@link} https://leetcode.com/problems/maximum-subarray/
 * 
 * @author Amit Das
 */
public class MaximumSubarray53V2 {

	public int maxSubArray(int[] nums) {
		int maxSum = Integer.MIN_VALUE;
		int arrayLen = nums.length;
		if (arrayLen > 0) {
			if (arrayLen == 1) {
				return nums[0];
			} else {
				int currIndex = 0;
				int subArrLen = 1;
				int currSum = 0;
				while (currIndex < arrayLen) {
					if ((currIndex + subArrLen) <= arrayLen) {
						currSum = IntStream.range(currIndex, currIndex + subArrLen).map(num -> nums[num]).sum();
						if (currSum > maxSum) {
							maxSum = currSum;
						}
					}
					if (subArrLen == arrayLen) {
						currIndex++;
						subArrLen = 1;
						continue;
					}
					subArrLen++;
				}
			}
		}
		return maxSum;
	}

	public static void main(String[] args) {
		// Might not work for Big Input
		MaximumSubarray53V2 t = new MaximumSubarray53V2();
		System.out.println(t.maxSubArray(new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 })); // 6
		System.out.println(t.maxSubArray(new int[] { 1 })); // 1
		System.out.println(t.maxSubArray(new int[] { 5, 4, -1, 7, 8 })); // 23
		System.out.println(t.maxSubArray(new int[] { -2, 1 })); // 1
		System.out.println(t.maxSubArray(new int[] { -2, -3, -1 })); // -1
		System.out.println(t.maxSubArray(new int[] { -1, -1, -2, -2 })); // -1
		System.out.println(t.maxSubArray(new int[] { -1, -2 })); // -1
	}
}