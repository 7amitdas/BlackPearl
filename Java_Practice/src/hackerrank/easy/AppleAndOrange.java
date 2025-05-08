package hackerrank.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Prepare -> Algorithms -> Implementation
 * Apple and Orange
 * {@link} https://www.hackerrank.com/challenges/apple-and-orange
 * 
 * @author Amit Das
 */
public class AppleAndOrange {
	/**
	 * The first line contains two space-separated integers denoting the respective
	 * values of s and t. <br/>
	 * The second line contains two space-separated integers denoting the respective
	 * values of a and b. <br/>
	 * The third line contains two space-separated integers denoting the respective
	 * values of m and n. <br/>
	 * The fourth line contains space-separated integers denoting the respective
	 * distances that each apple falls from point a. <br/>
	 * The fifth line contains space-separated integers denoting the respective
	 * distances that each orange falls from point b. <br/>
	 */
	public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
		// Write your code here
		List<Integer> appleDropPosition = new ArrayList<>();
		List<Integer> orangeDropPosition = new ArrayList<>();
		Predicate<Integer> fruitsInHouse = dropPosition -> dropPosition >= s && dropPosition <= t;

		for (Integer p : apples) {
			appleDropPosition.add(a + p);
		}
		for (Integer q : oranges) {
			orangeDropPosition.add(b + q);
		}
		System.out.println(appleDropPosition.stream().filter(fruitsInHouse).count()); // Count of Apples in House
		System.out.println(orangeDropPosition.stream().filter(fruitsInHouse).count()); // Count of Oranges in House
	}

	public static void main(String[] args) {
		AppleAndOrange.countApplesAndOranges(7, 11, 5, 15, List.of(-2, 2, 1), List.of(5, -6));
	}
}