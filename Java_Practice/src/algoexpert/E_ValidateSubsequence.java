package algoexpert;

import java.util.Arrays;
import java.util.List;

public class E_ValidateSubsequence {

	public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
		// Write your code here.
		int currSeqIdx = 0;
		for (Integer c : array) {
			System.out.println(c);
			if (currSeqIdx < sequence.size() && c == sequence.get(currSeqIdx)) {
				currSeqIdx = currSeqIdx + 1;
				if (currSeqIdx == sequence.size()) {
					return true;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		List<Integer> array = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10, 12, 15, 10);
		List<Integer> sequence = Arrays.asList(1, 6, -1, 10);
		System.out.println(isValidSubsequence(array, sequence));
	}

}
