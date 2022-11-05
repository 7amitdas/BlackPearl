package algoexpert.easy;

import java.util.Arrays;

/**
 * Coding Interview Questions
 * Two Number Sum Solution 1
 * {@link} https://www.algoexpert.io/questions/two-number-sum
 */

public class TwoNumberSum1 {

	public static int[] twoNumberSum(int[] array, int targetSum) {
		// Write your code here.
		int target = 0;
		for ( int i = 0; i < array.length; i++ ) {
			for ( int j = i + 1; j < array.length; j++ ) {
				target = array[i] + array[j];
				if (target == targetSum) {
					return new int[] { array[i], array[j] };
				}
			}
		}
		return new int[0];
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(twoNumberSum(new int[] { 3, 5, -4, 8, 11, 1, -1, 6 }, 10)));
	}
}