package leetcode.easy.algorithm;

/**
 * LeetCode Problems Algorithms
 * 
 * First Bad Version {@link} https://leetcode.com/problems/first-bad-version/
 * 
 * @author Amit Das
 */
public class FirstBadVersion278 {

	boolean isBadVersion(int version) {
		if (version >= 9) {
			return true;
		}
		return false;
	}

	public int firstBadVersion(int n) {
		int start = 1;
		int end = n;
		int i;
		while (start < end) {
			i = start + (end - start) / 2;
			if (isBadVersion(i)) {
				end = i;
			} else {
				start = i + 1;
			}
		}
		return start;
	}

	public static void main(String[] args) {
		FirstBadVersion278 b = new FirstBadVersion278();
		System.out.println(b.firstBadVersion(19));
	}
}