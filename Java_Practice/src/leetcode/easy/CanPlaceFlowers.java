package leetcode.easy;

/**
 * Coding Interview Questions </br>
 * Can Place Flowers Solution 1 </br>
 * {@link} https://leetcode.com/problems/can-place-flowers
 * 
 * @author Amit Das
 */
public class CanPlaceFlowers {

	public boolean canPlaceFlowers(int[] flowerbed, int n) {
		for (int idx = 0; idx < flowerbed.length; idx++) {
			if (n != 0) {
				if (flowerbed[idx] == 0 && ((flowerbed.length == 1 && flowerbed[idx] == 0)
						|| (idx == 0 && ((idx + 1) < flowerbed.length) && flowerbed[idx + 1] == 0)
						|| (((idx - 1) >= 0 && flowerbed[idx - 1] == 0)
								&& ((idx + 1) < flowerbed.length && flowerbed[idx + 1] == 0))
						|| ((idx == flowerbed.length - 1) && flowerbed[idx - 1] == 0))) {
					flowerbed[idx] = 1;
					n--;
				}
			}
		}
		return n == 0;
	}

	public static void main(String[] args) {
		CanPlaceFlowers p = new CanPlaceFlowers();
		System.out.println(p.canPlaceFlowers(new int[] { 1, 0, 0, 0, 1 }, 1)); // True
		System.out.println(p.canPlaceFlowers(new int[] { 1, 0, 0, 0, 1 }, 2)); // False
		System.out.println(p.canPlaceFlowers(new int[] { 1, 0, 0, 0, 0, 1 }, 2)); // False
		System.out.println(p.canPlaceFlowers(new int[] { 1, 0, 0, 0, 1, 0, 0 }, 2)); // True
		System.out.println(p.canPlaceFlowers(new int[] { 0 }, 1)); // True
	}
}