package hackerrank.interviewproblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Amazon : Software Development Engineer
 * Problem Summary : Find the total power.
	Example: [2,3,2,1]

	Matrix[0, 0] : MIN[2] * SUM[2] = 2 * 2 = 4
	Matrix[0, 1] : MIN[2, 3] * SUM[2, 3] = 2 * 5 = 10
	Matrix[0, 2] : MIN[2, 3, 2] * SUM[2, 3, 2] = 2 * 7 = 14
	Matrix[0, 3] : MIN[2, 3, 2, 1] * SUM[2, 3, 2, 1] = 1 * 8 = 8
	Matrix[1, 1] : MIN[3] * SUM[3] = 3 * 3 = 9
	Matrix[1, 2] : MIN[3, 2] * SUM[3, 2] = 2 * 5 = 10
	Matrix[1, 3] : MIN[3, 2, 1] * SUM[3, 2, 1] = 1 * 6 = 6
	Matrix[2, 2] : MIN[2] * SUM[2] = 2 * 2 = 4
	Matrix[2, 3] : MIN[2, 1] * SUM[2, 1] = 1 * 3 = 3
	Matrix[3, 3] : MIN[1] * SUM[1] = 1 * 1 = 1
	Total : 69

 * @author Amit Das
*/
public class FindTotalPower {

	public static int findTotalPower(List<Integer> power) {
		// Write your code here
		int sumTotalPower = 0;
		List<Integer> subList;
		int min = 0;
		int sum = 0;
		for ( int i = 0; i < power.size(); i++ ) {
			for ( int j = i; j <= power.size(); j++ ) {
				subList = power.subList(i, j);
				if (!subList.isEmpty()) {
					min = Collections.min(subList);
					sum = subList.stream().collect(Collectors.summingInt(Integer::intValue));
					sumTotalPower += (min * sum);
				}
			}
		}
		return sumTotalPower;
	}

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(2);
		a.add(3);
		a.add(2);
		a.add(1);
		System.out.println(findTotalPower(a));
	}
}
