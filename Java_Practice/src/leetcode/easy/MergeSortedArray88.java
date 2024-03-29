package leetcode.easy;

import java.util.Arrays;

/**
 * LeetCode Problems
 * 
 * 88. Merge Sorted Array Solution 1 </br>
 * {@link} https://leetcode.com/problems/merge-sorted-array
 * 
 * @author Amit Das
 */
public class MergeSortedArray88 {

	public void merge(int[] nums1, int m, int[] nums2, int n) {
		for (int i = 0; i < n; i++) {
			nums1[m + i] = nums2[i];
		}
		Arrays.sort(nums1);
		System.out.println(Arrays.toString(nums1));
	}

	public static void main(String[] args) {
		MergeSortedArray88 t = new MergeSortedArray88();
		t.merge(new int[] { 1, 2, 3, 0, 0, 0 }, 3, new int[] { 2, 5, 6 }, 3);
	}
}