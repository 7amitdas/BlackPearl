package algoexpert.easy;

import java.util.Arrays;

/**
 * Coding Interview Questions </br>
 * Minimum Waiting Time Solution 1 </br>
 * {@link} https://www.algoexpert.io/questions/minimum-waiting-time
 * 
 * @author Amit Das
 */
public class MinimumWaitingTime1 {

	public int minimumWaitingTime(int[] queries) {
		// Write your code here.
		int minWaitTime = 0;
		int prevWaitTime = 0;
		if (queries != null && queries.length != 0 && queries.length != 1) {
			Arrays.sort(queries);
			for (int i = 1; i < queries.length; i++) {
				prevWaitTime = prevWaitTime + queries[i - 1];
				minWaitTime = minWaitTime + prevWaitTime;
			}
		}
		return minWaitTime;
	}

	public static void main(String[] args) {
		MinimumWaitingTime1 m = new MinimumWaitingTime1();
		System.out.println(m.minimumWaitingTime(new int[] { 3, 2, 1, 2, 6 }));
	}
}