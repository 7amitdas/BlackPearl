package algoexpert.easy;

/**
 * Coding Interview Questions <br>
 * Palindrome Check Solution 1 <br>
 * {@link} https://www.algoexpert.io/questions/palindrome-check
 * 
 * @author Amit Das
 */
public class PalindromeCheck1 {

	public static boolean isPalindrome(String str) {
		// Write your code here.
		char[] strArr = str.toCharArray();
		for (int i = 0; i < strArr.length/2; i++) {
			if (strArr[i] != strArr[strArr.length - 1 - i]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(PalindromeCheck1.isPalindrome("abcdcba"));
		System.out.println(PalindromeCheck1.isPalindrome("a"));
		System.out.println(PalindromeCheck1.isPalindrome("Java"));
		System.out.println(PalindromeCheck1.isPalindrome(""));
	}
}