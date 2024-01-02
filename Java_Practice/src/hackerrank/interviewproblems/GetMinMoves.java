package hackerrank.interviewproblems;

import java.util.ArrayList;
import java.util.List;

/**
 * Amazon : Software Development Engineer
 * Problem Summary : Count the minimum moves required to move the low weighted plate at the top 
	and high weighted plate at the bottom of a stack only. All other plates might be unsorted. All the plates has distinct weight.
 * 
 * @author Amit Das
*/
public class GetMinMoves {

	public static int getMinMoves(List<Integer> plates) {
		// Write your code here
		int lowWeightPlate = plates.get(0);
		int highWeightPlate = 0;
		for ( Integer plate : plates ) {
			if (plate < lowWeightPlate) {
				lowWeightPlate = plate;
			}
			if (plate > highWeightPlate) {
				highWeightPlate = plate;
			}
		}
		int lowIdx = plates.indexOf(lowWeightPlate);
		int highIdx = plates.indexOf(highWeightPlate);

		if (lowIdx != 0 && (highIdx != plates.size() - 1)) {
			highIdx = highIdx + 1;
		}
		highIdx = plates.size() - 1 - highIdx;
		return lowIdx + highIdx;
	}

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(5);
		a.add(2);
		a.add(4);
		a.add(3);
		a.add(1);
		a.add(6);
		System.out.println(getMinMoves(a));
		long end = System.currentTimeMillis();
		float sec = (end - start) / 1000F;
		System.out.println(sec + " seconds");
	}

}
