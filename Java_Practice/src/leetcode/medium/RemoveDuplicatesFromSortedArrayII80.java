package leetcode.medium;

import java.util.Arrays;

/**
 * LeetCode Problems
 * 
 * 80. Remove Duplicates From Sorted Array II Solution 1 </br>
 * {@link} https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii
 * 
 * @author Amit Das
 */
public class RemoveDuplicatesFromSortedArrayII80 {

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
		RemoveDuplicatesFromSortedArrayII80 t = new RemoveDuplicatesFromSortedArrayII80();
		int[] nums = new int[] { 1, 1, 1, 2, 2, 3 };
		System.out.println(t.removeDuplicates(nums));
		System.out.println(Arrays.toString(nums));
	}
}