package algoexpert.easy;

/**
 * Coding Interview Questions </br>
 * Nth Fibonacci Solution 1 </br>
 * {@link} https://www.algoexpert.io/questions/nth-fibonacci
 * 
 * @author Amit Das
 */
public class NthFibonacci1 {

	public static int getNthFib(int n) {
		// Write your code here.
		int currElement = -1;
		int prevPrevElement = 0;
		int prevElement = 1;
		if (n == 1) {
			return prevPrevElement;
		} else if (n == 2) {
			return prevElement;
		} else {
			for (int i = 2; i < n; i++) {
				currElement = prevPrevElement + prevElement;
				prevPrevElement = prevElement;
				prevElement = currElement;
			}
			return currElement;
		}
	}

	public static void main(String[] args) {
		System.out.println(NthFibonacci1.getNthFib(5));
	}
}