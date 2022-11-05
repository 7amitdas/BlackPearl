package algoexpert.easy;

import java.util.Arrays;

/**
 * Coding Interview Questions
 * Sorted Squared Array
 * {@link} https://www.algoexpert.io/questions/sorted-squared-array
 */

public class SortedSquaredArray {

	public int[] sortedSquaredArray(int[] array) {
		// Write your code here.
		for (int i = 0; i < array.length; i++) {
			array[i] *= array[i];
		}
		Arrays.sort(array);
		return array;
	}

	public static void main(String[] args) {
		SortedSquaredArray e = new SortedSquaredArray();
		int[] retArr = e.sortedSquaredArray(new int[] { -2, -1, 1, 2, 3, 5, 8 });
		for (int i = 0; i < retArr.length; i++) {
			System.out.println(retArr[i]);
		}
	}
}