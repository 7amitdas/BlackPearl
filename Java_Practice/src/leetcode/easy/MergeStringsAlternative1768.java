package leetcode.easy;

/**
 * LeetCode Problems
 * 
 * Merge Strings Alternately
 * {@link} https://leetcode.com/problems/merge-strings-alternately
 * 
 * @author Amit Das
 */
public class MergeStringsAlternative1768 {

	public String mergeAlternately(String word1, String word2) {
		String wordsEndChar = "";
		int arrayLength = word1.length();
		StringBuilder sb = new StringBuilder();

		if (word1.length() > word2.length()) {
			arrayLength = word2.length();
			wordsEndChar = word1.substring(word2.length());
		} else {
			arrayLength = word1.length();
			wordsEndChar = word2.substring(word1.length());
		}
		for (int i = 0; i < arrayLength; i++) {
			sb.append(word1.charAt(i) + "" + word2.charAt(i));
		}
		sb.append(wordsEndChar);
		return sb.toString();
	}

	public static void main(String[] args) {
		MergeStringsAlternative1768 t = new MergeStringsAlternative1768();
		System.out.println(t.mergeAlternately("abcd", "pq"));
	}
}