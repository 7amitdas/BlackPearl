package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * LeetCode Problems
 * 
 * 13. Roman To Integer Solution 1 <br>
 * {@link} https://leetcode.com/problems/roman-to-integer/
 * 
 * @author Amit Das
 */
public class RomanToInt13 {

	public int romanToInt(String s) {
		int result = 0;
		Map<Character, Integer> romanValue = new HashMap<>();
		romanValue.put('I', 1);
		romanValue.put('V', 5);
		romanValue.put('X', 10);
		romanValue.put('L', 50);
		romanValue.put('C', 100);
		romanValue.put('D', 500);
		romanValue.put('M', 1000);
		char ind = ' ';
		for ( int i = 0; i < s.length(); i++ ) {
			ind = s.charAt(i);
			try {
				if ((ind == 'I' && (s.charAt(i + 1) == 'V' || s.charAt(i + 1) == 'X')) || (ind == 'X' && (s.charAt(i + 1) == 'L' || s.charAt(i + 1) == 'C'))
						|| (ind == 'C' && (s.charAt(i + 1) == 'D' || s.charAt(i + 1) == 'M'))) {
					result = result + romanValue.get(s.charAt(++i)) - romanValue.get(ind);
				} else {
					if (romanValue.containsKey(ind)) {
						result = result + romanValue.get(ind);
					}
				}
			} catch (StringIndexOutOfBoundsException e) {
				if (romanValue.containsKey(ind)) {
					result = result + romanValue.get(ind);
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		RomanToInt13 t = new RomanToInt13();
		System.out.println(t.romanToInt("MCMXCIVIIIIVVIV"));
	}
}