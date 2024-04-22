package leetcode.easy;

/**
 * Coding Interview Questions </br>
 * 345. Reverse Vowels Of A String Solution 1 </br>
 * {@link} https://leetcode.com/problems/reverse-vowels-of-a-string
 * 
 * @author Amit Das
 */
public class ReverseVowelsOfAString345 {

	public String reverseVowels(String s) {
		char[] str = s.toCharArray();
		int firstIndex = 0;
		int lastIndex = str.length - 1;
		boolean firstVFound = false;
		boolean lastVFound = false;
		while (firstIndex <= lastIndex) {
			if (!firstVFound && isVowel(str[firstIndex])) {
				firstVFound = true;
			}
			if (!lastVFound && isVowel(str[lastIndex])) {
				lastVFound = true;
			}
			if (firstVFound && lastVFound) {
				char temp = str[lastIndex];
				str[lastIndex] = str[firstIndex];
				str[firstIndex] = temp;
				firstVFound = false;
				lastVFound = false;
				firstIndex++;
				lastIndex--;
			} else if (firstVFound && !lastVFound) {
				lastIndex--;
			} else if (!firstVFound && lastVFound) {
				firstIndex++;
			} else {
				firstIndex++;
				lastIndex--;
			}
		}
		return new String(str);
	}

	public boolean isVowel(char c) {
		return c == 'A' || c == 'a' || c == 'E' || c == 'e' || c == 'I' || c == 'i' || c == 'O' || c == 'o' || c == 'U'
				|| c == 'u';
	}

	public static void main(String[] args) {
		ReverseVowelsOfAString345 p = new ReverseVowelsOfAString345();
		System.out.println(p.reverseVowels("hello"));
		System.out.println(p.reverseVowels("leetcode"));
	}
}