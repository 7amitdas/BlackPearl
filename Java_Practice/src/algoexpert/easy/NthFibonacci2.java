package algoexpert.easy;

/**
 * Coding Interview Questions </br>
 * Nth Fibonacci Solution 2 </br>
 * {@link} https://www.algoexpert.io/questions/nth-fibonacci
 * 
 * @author Amit Das
 */
public class NthFibonacci2 {

	public static int getNthFib(int n) {
		// Write your code here.
		if (n == 1) {
			return 0;
		} else if (n == 2) {
			return 1;
		} else {
			return getNthFib(n - 1) + getNthFib(n - 2);
		}
	}

	public static void main(String[] args) {
		System.out.println(NthFibonacci2.getNthFib(10));
	}
}