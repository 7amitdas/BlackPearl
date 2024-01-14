package hackerrank.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Hacker Rank Java > Data Structures
 * 
 * Java Map {@link} https://www.hackerrank.com/challenges/phone-book
 * 
 * @author Amit Das
 */
public class DataStructuresJavaMap {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			Map<String, Integer> phoneBook = new HashMap<>();
			int noOfEntries = in.nextInt();
			in.nextLine();
			for (int i = 0; i < noOfEntries; i++) {
				String name = in.nextLine();
				int phone = in.nextInt();
				phoneBook.put(name, phone);
				in.nextLine();
			}
			while (in.hasNext()) {
				String nameToFind = in.nextLine();
				Integer phoneNo = phoneBook.get(nameToFind);
				if (phoneNo == null || phoneNo == 0) {
					System.out.println("Not found");
				} else {
					System.out.println(nameToFind + "=" + phoneNo);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}