package algoexpert.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Three Number Sum
 * Solution 1
 * {@link} https://www.algoexpert.io/questions/three-number-sum
 */

public class ThreeNumberSum1 {

	public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
		// Write your code here.
		List<Integer[]> retResult = new ArrayList<>();
		Integer[] sortedArray;
		int inputArrLen = array.length;

		// Find Triplet
		// 1st Loop for 1st Position index
		for ( int i = 0; i < inputArrLen; i++ ) {
			// Check if 1st position has two more next position to move otherwise break
			if ((i + 2) < inputArrLen) {
				// 2nd Loop for 2nd Position Index
				for ( int j = i + 1; j < inputArrLen; j++ ) {
					// Check if 2nd position has one more next position to move otherwise break
					if ((j + 1) < inputArrLen) {
						for ( int k = j + 1; k < inputArrLen; k++ ) {
							// Sum the triplets and check if it matches to the targetSum 
							if ((array[i] + array[j] + array[k]) == targetSum) {
								sortedArray = new Integer[3];
								sortedArray[0] = array[i];
								sortedArray[1] = array[j];
								sortedArray[2] = array[k];
								//Sort the numbers and put in a ArrayList
								Arrays.sort(sortedArray);
								//Add those triplets into a List of Integer Array
								retResult.add(sortedArray);
							}
						}
					} else {
						break;
					}
				}
			} else {
				break;
			}
		}
		// Sort those Integer Arrays inside the List
		Collections.sort(retResult, Arrays::compare);
		return retResult;
	}

	public static void main(String[] args) {
		List<Integer[]> retList = threeNumberSum(new int[] { 12, 3, 1, 2, -6, 5, -8, 6 }, 0);
		//System.out.println(retList);
		for ( Integer[] integers : retList ) {
			System.out.println(Arrays.toString(integers));
		}
	}

}
