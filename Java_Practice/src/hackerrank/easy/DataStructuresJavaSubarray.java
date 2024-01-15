package hackerrank.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Hacker Rank Java > Data Structures
 * 
 * Java Subarray
 * {@link} https://www.hackerrank.com/challenges/java-negative-subarray
 * 
 * @author Amit Das
 */
public class DataStructuresJavaSubarray {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			List<Integer> numberList = new ArrayList<>();
			int lengthOfArray = in.nextInt();
			in.nextLine();
			for (int i = 0; i < lengthOfArray; i++) {
				numberList.add(in.nextInt());
			}
			int countSubArrayOfNegative = 0;
			for (int currIndex = 0; currIndex < numberList.size(); currIndex++) {
				for (int j = currIndex + 1; j <= numberList.size(); j++) {
					if (numberList.subList(currIndex, j).stream().reduce(0, Integer::sum).intValue() < 0) {
						countSubArrayOfNegative++;
					}
				}
			}
			System.out.println(countSubArrayOfNegative);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}