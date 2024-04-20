package leetcode.medium;

import java.util.Arrays;

/**
 * LeetCode Problems
 * 
 * 189. Rotate Array Solution 1 </br>
 * {@link} https://leetcode.com/problems/rotate-string/
 * 
 * @author Amit Das
 */
public class RotateArray189 {

	public void rotate(int[] nums, int k) {
		if (nums.length > 0) {
			for (int i = 0; i < k; i++) {
				int shiftNum = nums[nums.length - 1];
				for (int j = nums.length - 1; j >= 0; j--) {
					if (j == 0) {
						nums[j] = shiftNum;
					} else {
						nums[j] = nums[j - 1];
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		RotateArray189 t = new RotateArray189();
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