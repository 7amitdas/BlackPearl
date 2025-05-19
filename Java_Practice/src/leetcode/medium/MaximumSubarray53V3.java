package leetcode.medium;

/**
 * LeetCode Problems
 * 
 * 53. Maximum Subarray Solution 3 </br>
 * {@link} https://leetcode.com/problems/maximum-subarray/
 * 
 * @author Amit Das
 */
public class MaximumSubarray53V3 {

	public int maxSubArray(int[] nums) {
		int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        
        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        return maxSum;
	}

	public static void main(String[] args) {
		MaximumSubarray53V3 t = new MaximumSubarray53V3();
		System.out.println(t.maxSubArray(new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 })); // 6
		System.out.println(t.maxSubArray(new int[] { 1 })); // 1
		System.out.println(t.maxSubArray(new int[] { 5, 4, -1, 7, 8 })); // 23
		System.out.println(t.maxSubArray(new int[] { -2, 1 })); // 1
		System.out.println(t.maxSubArray(new int[] { -2, -3, -1 })); // -1
		System.out.println(t.maxSubArray(new int[] { -1, -1, -2, -2 })); // -1
		System.out.println(t.maxSubArray(new int[] { -1, -2 })); // -1
	}
}