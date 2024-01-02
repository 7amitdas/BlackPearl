package codingame;

/**
 * Interview Coding Test 3
 * Problem Details: 
 * 1. money is total Budget that to be distributed among grand children giftees
 * 2. A giftee can have maximum of 8 as gift
 * 3. A giftee can not have 0 or 4 as gift
 * 4. 
 * Find the Minimum distribution count among all the giftees
 * 
 * @author Amit Das
 */

public class LuckyMoney {

	public static int luckyMoney(int money, int giftees) {
		// Write your code here
		// To debug: System.err.println("Debug messages...");
		int a = money / 8;
		if (a == giftees) {
			return a;
		} else {
			if (a > giftees) {
				return giftees;
			} else if (a - 1 < 0) {
				return 0;
			} 
			return a - 1;
		}
	}

	public static void main(String[] args) {
		System.out.println(LuckyMoney.luckyMoney(2500, 2));
	}

}
