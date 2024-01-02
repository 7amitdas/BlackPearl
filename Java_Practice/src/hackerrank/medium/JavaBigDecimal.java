package hackerrank.medium;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Hacker Rank Java > BigNumber
 * 
 * Java BigDecimal {@link} https://www.hackerrank.com/challenges/java-bigdecimal
 * 
 * @author Amit Das
 */
public class JavaBigDecimal {

	static class Pair {
		private String numStr;
		private BigDecimal num;

		public Pair(String numStr, BigDecimal num) {
			this.numStr = numStr;
			this.num = num;
		}

		public String getNumStr() {
			return numStr;
		}

		public BigDecimal getNum() {
			return num;
		}
	}

	public static void printBigDecimalInOrder(int noOfInt, List<Pair> numberList) {
		numberList.stream().sorted(new Comparator<Pair>() {
			@Override
			public int compare(Pair o1, Pair o2) {
				return o2.getNum().compareTo(o1.getNum());
			}
		}).forEach(g -> {
			System.out.println(g.getNumStr());
		});
	}

	public static void main(String[] args) {
		int noOfInt = 0;
		List<Pair> numberList = new LinkedList<>();
		try (Scanner sc = new Scanner(System.in)) {
			noOfInt = sc.nextInt();
			int i = 0;
			while (sc.hasNext() && i <= noOfInt) {
				String nextNumber = sc.next();
				numberList.add(new Pair(nextNumber, new BigDecimal(nextNumber)));
				i++;
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		printBigDecimalInOrder(noOfInt, numberList);
	}
}