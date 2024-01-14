package hackerrank.easy;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 * Hacker Rank Java > Data Structures
 * 
 * Java HashSet {@link} https://www.hackerrank.com/challenges/java-hashset
 * 
 * @author Amit Das
 */
public class DataStructuresJavaHashSet {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			Set<String> pairsSet = new HashSet<>();
			List<Integer> listOfUnPairNum = new LinkedList<>();
			int noOfPairs = in.nextInt();
			in.nextLine();
			for (int i = 0; i < noOfPairs; i++) {
				String name = in.nextLine();
				pairsSet.add(name);
				listOfUnPairNum.add(pairsSet.size());
			}
			listOfUnPairNum.forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}