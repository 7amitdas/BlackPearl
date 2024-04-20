package leetcode.easy;

/**
 * LeetCode Problems
 * 
 * 1071. Greatest Common Divisor of Strings Solution 1 </br>
 * {@link} https://leetcode.com/problems/greatest-common-divisor-of-strings
 * 
 * @author Amit Das
 */
public class GreatestCommonDivisorOfStrings1071 {

	public String gcdOfStrings(String str1, String str2) {
		if (str1.concat(str2).equalsIgnoreCase(str2.concat(str1))) {
			int minIndex = getMinIndex(str1.length(), str2.length());
			return str1.substring(0, minIndex);
		}
		return "";
	}

	private int getMinIndex(int a, int b) {
		return b == 0 ? a : getMinIndex(b, a % b);
	}

	public static void main(String[] args) {
		GreatestCommonDivisorOfStrings1071 t = new GreatestCommonDivisorOfStrings1071();
		System.out
				.println(t.gcdOfStrings("TAUXXTAUXXTAUXXTAUXXTAUXX", "TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX"));
	}
}