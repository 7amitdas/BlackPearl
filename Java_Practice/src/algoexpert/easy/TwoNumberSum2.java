package algoexpert.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Coding Interview Questions
 * Two Number Sum Solution 2
 * {@link} https://www.algoexpert.io/questions/two-number-sum
 * 
 * @author Amit Das
 */

public class TwoNumberSum2 {

	public static int[] twoNumberSum(int[] array, int targetSum) {
		// Write your code here.
		int otherNum = 0;
		List<Integer> listOfNums = new ArrayList<>();
		for ( int i = 0; i < array.length; i++ ) {
			otherNum = targetSum - array[i];
			if (listOfNums.indexOf(otherNum) == -1) {
				listOfNums.add(array[i]);
			} else {
				return new int[] { otherNum, array[i] };
			}
		}
		return new int[0];
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(twoNumberSum(new int[] { 3, 5, -4, 8, 11, 1, -1, 6 }, 10)));
	}
}