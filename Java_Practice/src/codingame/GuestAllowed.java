package codingame;

import java.util.HashSet;
import java.util.Set;

/**
 * Interview Coding Test 2
 * Problem Details: 
 * 1. No of Seats available in a Restaurant : nbSeats
 * 2. Array Index is the Customer Id
 * 3. A Customer will pay only once for the whole Day.
 * 4. In payingGuests Array Customer index wise Pay Amount is present which Customer is going to Pay per Day
 * 5. In guestMovements Array Customer movement is present. If a Index is found first time it will be treated as entry
 * for that customer, if that index found again that means that will be an exit for that customer likewise it can multiple
 * for a day. If No seats are available then Customers have to wait until the seats are available.
 * So, Find the total Income for the Customers who visited the restaurant and had food.
 * 
 * @author Amit Das
 */

public class GuestAllowed {

	public static int computeDayGains(int nbSeats, int[] payingGuests, int[] guestMovements) {
		// Write your code here
		// To debug: System.err.println("Debug messages...");
		int dayGains = 0;
		Set<Integer> guestVisited = new HashSet<>(nbSeats);
		Set<Integer> guestQue = new HashSet<>(nbSeats);

		for ( int i = 0; i < guestMovements.length; i++ ) {
			if (guestQue.size() < nbSeats) {
				guestVisited.add(guestMovements[i]);
				if (guestQue.contains(guestMovements[i])) {
					guestQue.remove(guestMovements[i]);
				} else {
					guestQue.add(guestMovements[i]);
				}
			} else {
				if (guestQue.contains(guestMovements[i])) {
					guestQue.remove(guestMovements[i]);
				}
			}
		}
		for ( Integer integer : guestVisited ) {
			dayGains = dayGains + payingGuests[integer];
		}
		return dayGains;
	}

	public static void main(String[] args) {
		System.out.println(GuestAllowed.computeDayGains(8, new int[] { 8, 12, 18, 29, 6, 33, 13, 7, 21, 11, 89, 12 }, new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 7, 6, 5, 4, 3, 2, 1, 0, 8, 9, 10 }));
	}
}