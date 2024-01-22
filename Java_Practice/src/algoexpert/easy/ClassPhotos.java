package algoexpert.easy;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Coding Interview Questions </br>
 * Class Photos Solution 1 </br>
 * {@link} https://www.algoexpert.io/questions/class-photos
 * 
 * @author Amit Das
 */
public class ClassPhotos {

	public boolean classPhotos(ArrayList<Integer> redShirtHeights, ArrayList<Integer> blueShirtHeights) {
		// Write your code here.
		int rowFormCount = 0;
		Collections.sort(redShirtHeights);
		Collections.sort(blueShirtHeights);
		if ((redShirtHeights.size() == blueShirtHeights.size()) && redShirtHeights.size() > 0) {
			for (int i = 0; i < redShirtHeights.size(); i++) {
				if (redShirtHeights.get(i).compareTo(blueShirtHeights.get(i)) > 0) {
					rowFormCount = rowFormCount + 1;
				} else if (redShirtHeights.get(i).compareTo(blueShirtHeights.get(i)) < 0) {
					rowFormCount = rowFormCount - 1;
				} else {
					return false;
				}
			}
			if (Math.abs(rowFormCount) == redShirtHeights.size()) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		ClassPhotos c = new ClassPhotos();
		ArrayList<Integer> redShirtHeights = new ArrayList<>();
		redShirtHeights.add(2);
		redShirtHeights.add(4);
		redShirtHeights.add(7);
		redShirtHeights.add(5);
		redShirtHeights.add(1);
		ArrayList<Integer> blueShirtHeights = new ArrayList<>();
		blueShirtHeights.add(3);
		blueShirtHeights.add(5);
		blueShirtHeights.add(6);
		blueShirtHeights.add(8);
		blueShirtHeights.add(2);
		System.out.println(c.classPhotos(redShirtHeights, blueShirtHeights));
	}
}