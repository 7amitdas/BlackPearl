package algoexpert.easy;

import java.util.Arrays;

/**
 * Coding Interview Questions
 * Non Constructible Change
 * {@link} https://www.algoexpert.io/questions/non-constructible-change
 */

public class NonConstructibleChange {

	public int nonConstructibleChange(int[] coins) {
		// Write your code here.
		int nonConChg = 1;
		if (coins.length > 0) {
			Arrays.sort(coins);
			if (coins[0] == 1) {
				for ( int i = 0; i < coins.length; i++ ) {
					if (coins[i] <= nonConChg) {
						nonConChg += coins[i];
					}
				}
			}
		}
		return nonConChg;
	}

	public static void main(String[] args) {
		int[] coins = new int[] { 5, 7, 1, 1, 2, 3, 22 };
		NonConstructibleChange n = new NonConstructibleChange();
		System.out.println(n.nonConstructibleChange(coins));
	}
}