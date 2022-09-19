package algoexpert.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeNumberSum {

	public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
		// Write your code here.
		List<Integer[]> retResult = new ArrayList<>();
		// Sort Array for Binary Searching
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		// find triplet
		for ( int i = 0; i < array.length; i++ ) {
			
		}
		
		// sum and if matches to targetSum 
		// then sort and put in a array

		// order the triplet array is the 2d array

		return retResult;
	}

	public static void main(String[] args) {
		System.out.println(threeNumberSum(new int[] { 12, 3, 1, 2, -6, 5, -8, 6 }, 0));
	}

}
