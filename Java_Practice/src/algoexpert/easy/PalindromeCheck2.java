package algoexpert.easy;

/**
 * Coding Interview Questions <br>
 * Palindrome Check Solution 2 <br>
 * {@link} https://www.algoexpert.io/questions/palindrome-check
 * 
 * @author Amit Das
 */
public class PalindromeCheck2 {

	public static boolean isPalindrome(String str) {
		// Write your code here.
		return str.equals(new StringBuilder(str).reverse().toString());
	}

	public static void main(String[] args) {
		System.out.println(PalindromeCheck2.isPalindrome("abcdcba")); // True
		System.out.println(PalindromeCheck2.isPalindrome("a")); // True
		System.out.println(PalindromeCheck2.isPalindrome("Java")); // False
		System.out.println(PalindromeCheck2.isPalindrome("")); // True
	}
}