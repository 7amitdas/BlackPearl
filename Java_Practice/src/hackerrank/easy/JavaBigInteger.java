package hackerrank.easy;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Hacker Rank Java > BigNumber
 * 
 * Java BigInteger
 * {@link} https://www.hackerrank.com/challenges/java-biginteger
 * 
 * @author Amit Das
 */
public class JavaBigInteger {

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
		Scanner scan = new Scanner(System.in);
        BigInteger a = scan.nextBigInteger();
        BigInteger b = scan.nextBigInteger();
        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
        scan.close();
	}
}