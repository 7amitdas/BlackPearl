package algoexpert.medium;

import java.util.Arrays;

/**
 * Smallest Difference Solution 2 <br>
 * {@link} https://www.algoexpert.io/questions/smallest-difference
 * 
 * @author Amit Das
 */

public class SmallestDifference2 {

	public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
		// Write your code here.
		Arrays.sort(arrayOne);
		Arrays.sort(arrayTwo);
		int[] resultArr = { arrayOne[0], arrayTwo[0] };
		int idxArrayOne = 0;
		int idxArrayTwo = 0;
		int absDiff = Integer.MAX_VALUE;
		while (idxArrayOne < arrayOne.length && idxArrayTwo < arrayTwo.length) {
			int firstNum = arrayOne[idxArrayOne];
			int secondNum = arrayTwo[idxArrayTwo];
			int currentDiff = Math.abs(firstNum - secondNum);
			if (currentDiff < absDiff) {
				absDiff = currentDiff;
				resultArr[0] = arrayOne[idxArrayOne];
				resultArr[1] = arrayTwo[idxArrayTwo];
			}
			if (firstNum < secondNum) {
				idxArrayOne++;
			} else if (secondNum < firstNum) {
				idxArrayTwo++;
			} else {
				resultArr[0] = firstNum;
				resultArr[1] = secondNum;
				return resultArr;
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