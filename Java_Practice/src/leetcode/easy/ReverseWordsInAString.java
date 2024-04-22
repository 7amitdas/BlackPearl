package leetcode.easy;

/**
 * Coding Interview Questions </br>
 * Reverse Words In A String Solution 1 </br>
 * {@link} https://leetcode.com/problems/reverse-words-in-a-string
 * 
 * @author Amit Das
 */
public class ReverseWordsInAString {

	public String reverseWords(String s) {
		StringBuilder sb = new StringBuilder();
		String[] words = s.trim().split(" ");
		for (int index = words.length - 1; index >= 0; index--) {
			if (!words[index].isBlank()) {
				sb.append(words[index]);
				if (index > 0) {
					sb.append(" ");
				}
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		ReverseWordsInAString p = new ReverseWordsInAString();
		System.out.println(p.reverseWords("the sky is blue"));
		System.out.println(p.reverseWords("  hello world  "));
		System.out.println(p.reverseWords("a good   example"));
	}
}