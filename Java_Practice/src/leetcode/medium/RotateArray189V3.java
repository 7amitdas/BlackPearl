package leetcode.medium;

import java.util.Arrays;

/**
 * LeetCode Problems
 * 
 * 189. Rotate Array Solution 3 </br>
 * {@link} https://leetcode.com/problems/rotate-string/
 * 
 * @author Amit Das
 */
public class RotateArray189V3 {

	public void rotate(int[] nums, int k) {
		int actualCycle = nums.length > 0 ? k % nums.length : 0;
		if (actualCycle != 0) {
			int[] reversedArray = Arrays.copyOfRange(nums, nums.length - actualCycle, nums.length);
			int[] unchangedArray = Arrays.copyOfRange(nums, 0, nums.length - actualCycle);

			for (int i = 0; i < reversedArray.length; i++) {
				nums[i] = reversedArray[i];
			}
			for (int i = 0; i < unchangedArray.length; i++) {
				nums[reversedArray.length + i] = unchangedArray[i];
			}
		}
	}

	public static void main(String[] args) {
		RotateArray189V3 t = new RotateArray189V3();
		int[] arr1 = new int[] { 1, 2, 3, 4, 5, 6, 7 };
		int[] arr2 = new int[] { -1 };
		int[] arr3 = new int[] { 1, 2 };
		int[] arr4 = new int[] {};
		t.rotate(arr1, 3);
		t.rotate(arr2, 2);
		t.rotate(arr3, 3);
		t.rotate(arr4, 5);
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(arr4));
	}
}