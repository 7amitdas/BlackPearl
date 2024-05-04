package algoexpert.medium;

import java.util.Arrays;

/**
 * Smallest Difference Solution 1 <br>
 * {@link} https://www.algoexpert.io/questions/smallest-difference
 * 
 * @author Amit Das
 */

public class SmallestDifference1 {

	public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
		// Write your code here.
		int[] resultArr = { arrayOne[0], arrayTwo[0] };
		int absDiff = Math.abs(arrayOne[0] - arrayTwo[0]);
		for (int i = 0; i < arrayOne.length; i++) {
			for (int j = 0; j < arrayTwo.length; j++) {
				int diff = Math.abs(arrayOne[i] - arrayTwo[j]);
				if (diff < absDiff) {
					absDiff = diff;
					resultArr[0] = arrayOne[i];
					resultArr[1] = arrayTwo[j];
				}
			}
		}
		return resultArr;
	}

	public static void main(String[] args) {
		int[] arrayOne = { -1, 5, 10, 20, 28, 3 };
		int[] arrayTwo = { 26, 134, 135, 15, 17 };
		int[] resultArr = smallestDifference(arrayOne, arrayTwo);
		System.out.println(Arrays.toString(resultArr));
	}
}