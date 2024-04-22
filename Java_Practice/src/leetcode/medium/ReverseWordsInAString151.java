package leetcode.medium;

/**
 * Coding Interview Questions </br>
 * 151. Reverse Words In A String Solution 1 </br>
 * {@link} https://leetcode.com/problems/reverse-words-in-a-string
 * 
 * @author Amit Das
 */
public class ReverseWordsInAString151 {

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
		ReverseWordsInAString151 p = new ReverseWordsInAString151();
		System.out.println(p.reverseWords("the sky is blue"));
		System.out.println(p.reverseWords("  hello world  "));
		System.out.println(p.reverseWords("a good   example"));
	}
}