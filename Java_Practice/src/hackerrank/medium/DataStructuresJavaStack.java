package hackerrank.medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Hacker Rank Java > Data Structures
 * 
 * Java Stack {@link} https://www.hackerrank.com/challenges/java-stack
 * 
 * @author Amit Das
 */
public class DataStructuresJavaStack {

	public static boolean isStringBalanced(String strToCheck) {
		if (!strToCheck.isBlank()) {
			char[] strArray = strToCheck.toCharArray();
			Stack<Character> lStack = new Stack<>();
			for (int i = 0; i < strArray.length; i++) {
				if ((strArray[i] == '(' || strArray[i] == '{' || strArray[i] == '[')) {
					lStack.push(strArray[i]);
				} else {
					if (lStack.isEmpty()) {
						return false;
					}
					char popChar = lStack.pop();
					if ((popChar == '(' && ')' != strArray[i]) || (popChar == '{' && '}' != strArray[i])
							|| (popChar == '[' && ']' != strArray[i])) {
						return false;
					} else {
						if (i == (strArray.length - 1)) {
							return lStack.isEmpty();
						}
					}
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		List<String> strsToCheck = new ArrayList<>();
		strsToCheck.add("{}()");
		strsToCheck.add("({()})");
		strsToCheck.add("{}(");
		strsToCheck.add("[]");
		strsToCheck.add("(((((()()()");
		for (String str : strsToCheck) {
			System.out.println(isStringBalanced(str));
		}
	}
}