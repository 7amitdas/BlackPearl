package hackerrank.interviewproblems;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * UBS Bank Poland/Switzerland : Senior Java Developer
 * Problem Summary : A list of String word and a Search word will be provided. Then for each character of 
 * the search word return a set of match keyword in lexicographic order (Dictionary Order)
 * List of words can be of Mix of Letter Case
 * 
 * Example: for a Search Word "car", in a List of words ("cDog", "Carpet", "car", "Cait", "C")
 * 1st Sub String is "c", then the Matched List will be, [c, cait, car, carpet, cdog]
 * 2nd Sub String is "ca", then the Matched List will be, [cait, car, carpet]
 * 3rd Sub String is "car", then the Matched List will be, [car, carpet]
 * 
 * @author Amit Das
*/
public class UBSInterviewProblem {
	public static void main(String[] args) {
		List<List<String>> returnList = new ArrayList<List<String>>();
		List<String> listOfWordsToSearch = List.of("cDog", "Carpet", "car", "Cait", "C");
		String searchWord = "car";
		for (int i = 0; i < searchWord.length(); i++) {
			String searchChar = searchWord.substring(0, i + 1);
			returnList.add(listOfWordsToSearch.stream()
					.map(String::toLowerCase)
					.filter(s -> s.contains(searchChar))
					.sorted().collect(Collectors.toList()));
		}
		System.out.println(returnList);
	}
}