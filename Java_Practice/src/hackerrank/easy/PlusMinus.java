package hackerrank.easy;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.List;

/**
 * One week preparation kit
 * {@link} https://www.hackerrank.com/challenges/one-week-preparation-kit-plus-minus/problem?h_l=interview&isFullScreen=true&playlist_slugs%5B%5D=preparation-kits&playlist_slugs%5B%5D=one-week-preparation-kit&playlist_slugs%5B%5D=one-week-day-one
 */

public class PlusMinus {

	public static void plusMinus(List<Integer> arr) {
		// Write your code here
		int posNum = 0;
		int negNum = 0;
		int zeroNum = 0;
		int arrSize = arr.size();
		for ( Integer number : arr ) {
			if (number.intValue() > 0) {
				posNum++;
			} else if (number.intValue() < 0) {
				negNum++;
			} else {
				zeroNum++;
			}
		}
		System.out.println(BigDecimal.valueOf((double) posNum / arrSize).setScale(6, RoundingMode.HALF_UP));
		System.out.println(BigDecimal.valueOf((double) negNum / arrSize).setScale(6, RoundingMode.HALF_UP));
		System.out.println(BigDecimal.valueOf((double) zeroNum / arrSize).setScale(6, RoundingMode.HALF_UP));
	}

	public static void main(String[] args) {
		plusMinus(Arrays.asList(-4, 3, -9, 0, 4, 1));
	}
}
