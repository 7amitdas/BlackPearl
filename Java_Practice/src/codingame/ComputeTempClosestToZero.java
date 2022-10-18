package codingame;

import java.util.Arrays;

/**
 * Interview Coding Test Example
 * Problem Details: Find the closest Temperature to zero from a list of temperatures.
 * If the difference is same for both positive and negative temperature return the positive temperature.
 */

public class ComputeTempClosestToZero {

	public static int computeClosestToZero(int[] ts) {
		// Write your code here
		// To debug: System.err.println("Debug messages...");
		if (ts.length > 0) {
			Arrays.sort(ts);
		} else {
			return 0;
		}
		for ( int i = 0; i < ts.length; i++ ) {
			if (ts[ts.length - 1] <= 0) {
				return ts[ts.length - 1];
			} else {
				if (ts[i] > 0) {
					return ts[i];
				}
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		System.out.println(ComputeTempClosestToZero.computeClosestToZero(new int[] { -5, -4, -2, 12, -40, 4, 2, 18, 11, 5 }));
	}
}