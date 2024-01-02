package hackerrank.easy;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Hacker Rank Java > Data Structures
 * 
 * Java List {@link} https://www.hackerrank.com/challenges/java-list
 * 
 * @author Amit Das
 */
public class DataStructuresJavaList {

	public static void main(String[] args) {
		int sizeOfList = 0;
		int noOfQuery = 0;
		int listIndexIns = 0;
		int listIndexDel = 0;
		int numberToInsert = 0;
		List<Integer> numberList = new LinkedList<>();
		try (Scanner sc = new Scanner(System.in)) {
			sizeOfList = sc.nextInt();
			int i = 0;
			while (sc.hasNext() && i < sizeOfList) {
				numberList.add(sc.nextInt());
				i++;
			}
			int j = 0;
			noOfQuery = sc.nextInt();
			while (sc.hasNext() && j < noOfQuery) {
				String operationName = sc.next();
				if ("Insert".equalsIgnoreCase(operationName)) {
					listIndexIns = sc.nextInt();
					numberToInsert = sc.nextInt();
					numberList.add(listIndexIns, numberToInsert);
				} else if ("Delete".equalsIgnoreCase(operationName)) {
					listIndexDel = sc.nextInt();
					numberList.remove(listIndexDel);
				}
				j++;
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		numberList.stream().distinct().forEach(n -> System.out.print(n + " "));
	}
}