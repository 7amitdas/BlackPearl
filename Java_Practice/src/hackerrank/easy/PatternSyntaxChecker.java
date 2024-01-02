package hackerrank.easy;

import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/**
 * Hacker Rank Java > Strings
 * 
 * Pattern Syntax Checker
 * {@link} https://www.hackerrank.com/challenges/pattern-syntax-checker
 * 
 * @author Amit Das
 */
public class PatternSyntaxChecker {

	public static void checkPattern(String s) {

	}

	public static void main(String[] args) {
		int testCases = 3;
		while (testCases > 0) {
			String pattern = "batcatpat(nat";
			// Write your code
			try {
				Pattern.compile(pattern);
				System.out.println("Valid");
			} catch (PatternSyntaxException e) {
				System.out.println("Invalid");
			}
			testCases--;
		}
	}
}