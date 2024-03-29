package hackerrank.easy;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Interview Preparation Kits
 * One Week Preparation Kit
 * Day 1
 * Mini Max Sum
 * {@link} https://www.hackerrank.com/challenges/one-week-preparation-kit-mini-max-sum
 * 
 * @author Amit Das
 */

public class MiniMaxSum {

	public static void miniMaxSum(List<Integer> arr) {
		// Write your code here
		long minSum = 0;
		long maxSum = 0;
		int arrSize = arr.size();
		Collections.sort(arr);
		if (arrSize >= 4) {
			minSum = (long) arr.get(0) + arr.get(1) + arr.get(2) + arr.get(3);
			maxSum = (long) arr.get(arrSize - 4) + arr.get(arrSize - 3) + arr.get(arrSize - 2) + arr.get(arrSize - 1);
		}
		System.out.println(minSum + " " + maxSum);
	}

	public static void main(String[] args) {
		miniMaxSum(Arrays.asList(256741038, 623958417, 467905213, 714532089, 938071625));
	}
}
