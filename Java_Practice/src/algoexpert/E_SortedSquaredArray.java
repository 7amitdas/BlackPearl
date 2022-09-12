package algoexpert;

import java.util.Arrays;

public class E_SortedSquaredArray {

	public int[] sortedSquaredArray(int[] array) {
		// Write your code here.
		for (int i = 0; i < array.length; i++) {
			array[i] *= array[i];
		}
		Arrays.sort(array);
		return array;
	}

	public static void main(String[] args) {
		E_SortedSquaredArray e = new E_SortedSquaredArray();
		int[] retArr = e.sortedSquaredArray(new int[] { -2, -1, 1, 2, 3, 5, 8 });
		for (int i = 0; i < retArr.length; i++) {
			System.out.println(retArr[i]);
		}
	}
}