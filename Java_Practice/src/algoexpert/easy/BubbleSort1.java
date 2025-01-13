package algoexpert.easy;

import java.util.Arrays;

/**
 * Coding Interview Questions Bubble Sort Solution 1
 * {@link} https://www.algoexpert.io/questions/bubble-sort
 * 
 * @author Amit Das
 */
public class BubbleSort1 {

	public static int[] bubbleSort(int[] array) {
		// Write your code here.
		boolean swapPlaced = false;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if ((j + 1) < array.length && array[j] > array[j + 1]) {
					int val = array[j];
					array[j] = array[j + 1];
					array[j + 1] = val;
					swapPlaced = true;
				}
			}
			if (!swapPlaced) {
				break;
			}
		}
		return array;
	}

	public static void main(String[] args) {
		int[] inputArray1 = new int[] { 8, 5, 2, 9, 5, 6, 3 }; // 2, 3, 5, 5, 6, 8, 9
		int[] maxNosArray1 = bubbleSort(inputArray1);
		System.out.println(Arrays.toString(maxNosArray1));
		
		int[] inputArray2 = new int[] { 2, 3, 5, 5, 6, 8, 9 }; // 2, 3, 5, 5, 6, 8, 9
		int[] maxNosArray2 = bubbleSort(inputArray2);
		System.out.println(Arrays.toString(maxNosArray2));
		
		int[] inputArray3 = new int[] { };
		int[] maxNosArray3 = bubbleSort(inputArray3);
		System.out.println(Arrays.toString(maxNosArray3));
	}
}