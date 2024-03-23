package hackerrank.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Hacker Rank Java > Data Structures
 * 
 * Java Arraylist {@link} https://www.hackerrank.com/challenges/java-arraylist
 * 
 * @author Amit Das
 */
public class DataStructuresJavaArraylist {

	public static void main(String[] args) {
		List<Integer[]> noList = new ArrayList<>();
		List<Integer[]> queryList = new ArrayList<>();
		// Gathering Inputs
		try (Scanner in = new Scanner(System.in)) {
			Integer noOfNumLines = Integer.parseInt(in.nextLine());
			while (noOfNumLines > 0) {
				String[] nextLineAr = in.nextLine().split(" ");
				Integer[] noArr = Arrays.stream(nextLineAr).skip(1).map(Integer::parseInt).toArray(Integer[]::new);
				noList.add(noArr);
				noOfNumLines--;
			}
			Integer noOfQueryLines = Integer.parseInt(in.nextLine());
			Integer[] queryArr = new Integer[2];
			while (noOfQueryLines > 0) {
				String[] queryLineAr = in.nextLine().split(" ");
				queryArr = Arrays.stream(queryLineAr).map(Integer::parseInt).toArray(Integer[]::new);
				queryList.add(queryArr);
				noOfQueryLines--;
			}
		} catch (Exception e) {
		}
		// Query on Input Collection
		queryList.forEach((query) -> {
			try {
				System.out.println(noList.get(query[0] - 1)[query[1] - 1]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("ERROR!");
			}
		});
	}
}