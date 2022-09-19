package leetcode.easy.algorithm;

public class BinarySearch704 {

	public int search(int[] nums, int target) {
		for ( int i = 0; i < nums.length; i++ ) {
			if (nums[i] == target) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		BinarySearch704 b = new BinarySearch704();
		System.out.println(b.search(new int[] { -1, 0, 3, 5, 9, 12 }, 2));
	}
}