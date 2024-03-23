package hackerrank.easy;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Hacker Rank Java > Data Structures
 * 
 * Java 2D Array {@link} https://www.hackerrank.com/challenges/java-2d-array
 * 
 * @author Amit Das
 */
public class DataStructuresJava2DArray {

	public static void printHourGlass(Integer a, Integer b, Integer c, Integer e, Integer g, Integer h, Integer i,
			Integer hourglassSum) {
		System.out.println("---------------------------------------");
		System.out.println(a + " " + b + " " + c);
		System.out.println("  " + e + "  ");
		System.out.println(g + " " + h + " " + i);
		System.out.println("---------------------------------------");
		System.out.println("SUM:::" + hourglassSum);
	}

	public static Integer getMaxHourGlassSum(List<Integer> prevLine, List<Integer> currLine, List<Integer> nextLine,
			Integer lineNo, Integer lengthOfArrayX) {
		Integer itemNo = 0;
		Integer maxSumForLine = Integer.MIN_VALUE;
		Integer hourglassSum = Integer.MIN_VALUE;
		for (Integer item : currLine) {
			if (itemNo == 0) {
				itemNo++;
				continue;
			}
			if (itemNo >= lengthOfArrayX - 1) {
				break;
			}
			Integer prevLineSum = prevLine.get(itemNo - 1) + prevLine.get(itemNo) + prevLine.get(itemNo + 1);
			Integer nextLineSum = nextLine.get(itemNo - 1) + nextLine.get(itemNo) + nextLine.get(itemNo + 1);
			hourglassSum = prevLineSum + item + nextLineSum;
			printHourGlass(prevLine.get(itemNo - 1), prevLine.get(itemNo), prevLine.get(itemNo + 1), item,
					nextLine.get(itemNo - 1), nextLine.get(itemNo), nextLine.get(itemNo + 1), hourglassSum);
			if (hourglassSum > maxSumForLine) {
				maxSumForLine = hourglassSum;
			}
			itemNo++;
		}
		return maxSumForLine;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		List<List<Integer>> arr = new ArrayList<>();

		IntStream.range(0, 6).forEach(i -> {
			try {
				arr.add(Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt)
						.collect(toList()));
			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
		});
		bufferedReader.close();

		Integer maxSum = Integer.MIN_VALUE;
		Integer hourglassSum = Integer.MIN_VALUE;
		Integer lengthOfArrayX = 6;
		Integer lengthOfArrayY = 6;
		Integer lineNo = 0;
		for (List<Integer> currElement : arr) {
			if (lineNo == 0) {
				lineNo++;
				continue;
			}
			if (lineNo >= lengthOfArrayY - 1) {
				break;
			}
			hourglassSum = getMaxHourGlassSum(arr.get(lineNo - 1), currElement, arr.get(lineNo + 1), lineNo,
					lengthOfArrayX);
			if (hourglassSum > maxSum) {
				maxSum = hourglassSum;
			}
			lineNo++;
		}
		System.out.println(maxSum);
	}
}