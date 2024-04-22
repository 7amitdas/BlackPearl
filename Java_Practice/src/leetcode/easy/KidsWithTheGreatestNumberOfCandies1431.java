package leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Coding Interview Questions </br>
 * 1431. Kids With The Greatest Number Of Candies Solution 1 </br>
 * {@link} https://leetcode.com/problems/kids-with-the-greatest-number-of-candies
 * 
 * @author Amit Das
 */
public class KidsWithTheGreatestNumberOfCandies1431 {

	public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
		List<Boolean> kidsWithCandies = new ArrayList<>();
		int maxNumOfCandies = Arrays.stream(candies).max().getAsInt();
		for (int candy : candies) {
			kidsWithCandies.add((candy + extraCandies) >= maxNumOfCandies);
		}
		return kidsWithCandies;
	}

	public static void main(String[] args) {
		KidsWithTheGreatestNumberOfCandies1431 p = new KidsWithTheGreatestNumberOfCandies1431();
		System.out.println(p.kidsWithCandies(new int[] { 2, 3, 5, 1, 3 }, 3));
	}
}