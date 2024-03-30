package leetcode.easy;

import java.util.Arrays;

/**
 * LeetCode Problems
 * 
 * 26. Remove Duplicates From Sorted Array Solution 1 </br>
 * {@link} https://leetcode.com/problems/remove-duplicates-from-sorted-array
 * 
 * @author Amit Das
 */
public class RemoveDuplicatesFromSortedArray26 {

	public int removeDuplicates(int[] nums) {
		int dupFoundOnIdx = 1;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] != nums[i - 1]) {
				nums[dupFoundOnIdx] = nums[i];
				dupFoundOnIdx++;
			}
		}
		return dupFoundOnIdx;
	}

	public static void main(String[] args) {
		RemoveDuplicatesFromSortedArray26 t = new RemoveDuplicatesFromSortedArray26();
		int[] nums = new int[] { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
		System.out.println(t.removeDuplicates(nums));
		System.out.println(Arrays.toString(nums));
	}
}