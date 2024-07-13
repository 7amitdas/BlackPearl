package leetcode.easy;

/**
 * LeetCode Problems
 * 
 * 1732. Find The Highest Altitude Solution 1 </br>
 * {@link} https://leetcode.com/problems/find-the-highest-altitude
 * 
 * @author Amit Das
 */
public class FindTheHighestAltitude1732 {

	public int largestAltitude(int[] gain) {
		int highestAlt = 0;
		int gainSum = 0;
		for (int i = 0; i < gain.length; i++) {
			gainSum = gainSum + gain[i];
			if (gainSum > highestAlt) {
				highestAlt = gainSum;
			}
		}
		return highestAlt;
	}

	public static void main(String[] args) {
		FindTheHighestAltitude1732 t = new FindTheHighestAltitude1732();
		int[] gainArr1 = new int[] { -5, 1, 5, 0, -7 };
		int[] gainArr2 = new int[] { -4, -3, -2, -1, 4, 3, 2 };
		System.out.println(t.largestAltitude(gainArr1)); // 1
		System.out.println(t.largestAltitude(gainArr2)); // 0
	}
}