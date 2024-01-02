package hackerrank.easy;

/**
 * Hacker Rank Java > Strings
 * 
 * Java String Tokens
 * {@link} https://www.hackerrank.com/challenges/java-string-tokens
 * 
 * @author Amit Das
 */
public class JavaStringTokens {

	public static void printStringTokens(String s) {
		if (s.trim().length() == 0) {
			System.out.println(0);
		} else {
			String s1[] = s.trim().split("[ !,?._'@]+");
			System.out.println(s1.length);
			for (int i = 0; i < s1.length; i++) {
				System.out.println(s1[i]);
			}
		}
	}

	public static void main(String[] args) {
		printStringTokens("");
	}
}