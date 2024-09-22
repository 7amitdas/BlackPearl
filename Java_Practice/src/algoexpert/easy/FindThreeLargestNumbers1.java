package algoexpert.easy;

import java.util.Arrays;

/**
 * Coding Interview Questions Find Three Largest Numbers Solution 1
 * {@link} https://www.algoexpert.io/questions/find-three-largest-numbers
 * 
 * @author Amit Das
 */
public class FindThreeLargestNumbers1 {

	public static int[] findThreeLargestNumbers(int[] array) {
		// Write your code here.
		int lastMaxNo = Integer.MIN_VALUE;
		int sLastMaxNo = Integer.MIN_VALUE;
		int tLastMaxNo = Integer.MIN_VALUE;

		for (int i = 0; i < array.length; i++) {
			if (array[i] >= tLastMaxNo && array[i] >= sLastMaxNo && array[i] >= lastMaxNo) {
				tLastMaxNo = sLastMaxNo;
				sLastMaxNo = lastMaxNo;
				lastMaxNo = array[i];
			} else if (array[i] >= tLastMaxNo && array[i] >= sLastMaxNo && array[i] < lastMaxNo) {
				tLastMaxNo = sLastMaxNo;
				sLastMaxNo = array[i];
			} else if (array[i] >= tLastMaxNo && array[i] < sLastMaxNo && array[i] < lastMaxNo) {
				tLastMaxNo = array[i];
			}
		}
		return new int[] { tLastMaxNo, sLastMaxNo, lastMaxNo };
	}

	public static void main(String[] args) {
		int[] inputArray1 = new int[] { 10, 5, 9, 10, 12 }; // 10, 10, 12
		int[] maxNosArray1 = findThreeLargestNumbers(inputArray1);
		System.out.println(Arrays.toString(maxNosArray1));

		int[] inputArray2 = new int[] { 141, 1, 17, -7, -17, -27, 18, 541, 8, 7, 7 }; // 18, 141, 541
		int[] maxNosArray2 = findThreeLargestNumbers(inputArray2);
		System.out.println(Arrays.toString(maxNosArray2));
	}
}