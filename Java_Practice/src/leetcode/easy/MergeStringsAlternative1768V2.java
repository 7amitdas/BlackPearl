package leetcode.easy;

/**
 * LeetCode Problems
 * 
 * 1768. Merge Strings Alternately Solution 2 </br>
 * {@link} https://leetcode.com/problems/merge-strings-alternately
 * 
 * @author Amit Das
 */
public class MergeStringsAlternative1768V2 {

	public String mergeAlternately(String word1, String word2) {
		int word1Length = word1.length();
		int word2Length = word2.length();
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < word1Length || i < word2Length; i++) {
			if (i < word1Length) {
				sb.append(word1.charAt(i));
			}
			if (i < word2Length) {
				sb.append(word2.charAt(i));
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		MergeStringsAlternative1768V2 t = new MergeStringsAlternative1768V2();
		System.out.println(t.mergeAlternately("abcd", "pq"));
	}
}