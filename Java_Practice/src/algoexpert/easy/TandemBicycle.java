package algoexpert.easy;

import java.util.Arrays;

/**
 * Coding Interview Questions </br>
 * Tandem Bicycle Solution 1 </br>
 * {@link} https://www.algoexpert.io/questions/tandem-bicycle
 * 
 * @author Amit Das
 */
public class TandemBicycle {

	public int tandemBicycle(int[] redShirtSpeeds, int[] blueShirtSpeeds, boolean fastest) {
		// Write your code here.
		Arrays.sort(redShirtSpeeds);
		Arrays.sort(blueShirtSpeeds);
		int totalSpeed = 0;
		for (int i = 0; i < redShirtSpeeds.length; i++) {
			if (fastest) {
				totalSpeed = totalSpeed
						+ Integer.max(redShirtSpeeds[i], blueShirtSpeeds[redShirtSpeeds.length - 1 - i]);
			} else {
				totalSpeed = totalSpeed + Integer.max(redShirtSpeeds[i], blueShirtSpeeds[i]);
			}
		}
		return totalSpeed;
	}

	public static void main(String[] args) {
		TandemBicycle t = new TandemBicycle();
		System.out.println(t.tandemBicycle(new int[] { 5, 5, 3, 9, 2 }, new int[] { 3, 6, 7, 2, 1 }, false));
	}
}