package hackerrank.easy;

/**
 * Prepare -> Algorithms -> Implementation
 * Kangaroo
 * {@link} https://www.hackerrank.com/challenges/kangaroo
 * 
 * @author Amit Das
 */
public class Kangaroo {

	public static String kangaroo(int x1, int v1, int x2, int v2) {
		// Write your code here
		if (x1 == x2) {
			if (v1 == v2) {
				return "YES";
			} else {
				return "NO";
			}
		} else {
			if (x1 < x2) {
				while (x1 < x2) {
					x1 = x1 + v1;
					x2 = x2 + v2;
					if (x1 == x2) {
						return "YES";
					} else if (x1 > x2) {
						return "NO";
					}
				}
			} else {
				while (x1 > x2) {
					x1 = x1 + v1;
					x2 = x2 + v2;
					if (x1 == x2) {
						return "YES";
					} else if (x1 < x2) {
						return "NO";
					}
				}
			}
		}
		return "NO";
	}

	public static void main(String[] args) {
		System.out.println(Kangaroo.kangaroo(0, 2, 5, 3));
	}
}