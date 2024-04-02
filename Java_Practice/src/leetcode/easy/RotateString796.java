package leetcode.easy;

/**
 * LeetCode Problems
 * 
 * 796. Rotate String Solution 1 </br>
 * {@link} https://leetcode.com/problems/rotate-string/
 * 
 * @author Amit Das
 */
public class RotateString796 {

	public boolean rotateString(String s, String goal) {
		if (s.length() == goal.length()) {
			for (int i = 0; i < s.length(); i++) {
				s = s.substring(1) + s.substring(0, 1);
				if (s.equalsIgnoreCase(goal)) {
					return true;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		RotateString796 t = new RotateString796();
		System.out.println(t.rotateString("abcde", "cdeab"));
	}
}