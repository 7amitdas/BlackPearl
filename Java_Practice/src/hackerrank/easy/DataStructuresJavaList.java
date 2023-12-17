package hackerrank.easy;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Hacker Rank Java > Data Structures
 * 
 * Java List {@link} https://www.hackerrank.com/challenges/java-list
 */
public class DataStructuresJavaList {

	public static void main(String[] args) {
		int sizeOfList = 0;
		int noOfQuery = 0;
		int listIndexInsDel = 0;
		int numberToInsert = 0;
		List<Integer> numberList = new LinkedList<>();
		try (Scanner sc = new Scanner(System.in)) {
			sizeOfList = sc.nextInt();
			int i = 0;
			while (sc.hasNext() && i < sizeOfList) {
				numberList.add(sc.nextInt());
				i++;
			}
			i = 0;
			noOfQuery = sc.nextInt();
			while (sc.hasNext() && i < noOfQuery) {
				if ("Insert".equalsIgnoreCase(sc.next())) {
					listIndexInsDel = sc.nextInt();
					numberToInsert = sc.nextInt();
					numberList.add(listIndexInsDel, numberToInsert);
				} else if ("Delete".equalsIgnoreCase(sc.next())) {
					listIndexInsDel = sc.nextInt();
					numberList.remove(listIndexInsDel);
				}
				i++;
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		System.out.println(numberList);
	}
}