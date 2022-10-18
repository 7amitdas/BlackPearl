package codingame;

import java.util.HashSet;
import java.util.Set;

/**
 * Interview Coding Test 1
 * Problem Details: Find if a Number made of maximum of two number digits. If yes, return "y",  otherwise "n".
 */

public class DuoDigit {

	public static String isDuoDigit(int number) {
		// Write your code here
		// To debug: System.err.println("Debug messages...");
		String num = String.valueOf(Math.abs(number));
		char[] c = num.toCharArray();
		Set<Character> s = new HashSet<>();
		for ( int i = 0; i < c.length; i++ ) {
			s.add(c[i]);
		}
		return s.size() <= 2 ? "y" : "n";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(DuoDigit.isDuoDigit(-2020));
	}

}
