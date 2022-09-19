package leetcode.easy.algorithm;

public class SearchInsertPosition35 {

	public int searchInsert(int[] nums, int target) {
		int arrayLen = nums.length;
		int lowIdx = 0;
		int highIdx = arrayLen - 1;
		if (target < nums[0]) {
			return 0;
		} else if (target > nums[arrayLen - 1]) {
			return arrayLen;
		} else {
			while (lowIdx <= highIdx) {
				int midIdx = (lowIdx + highIdx) / 2;
				int midIdxVal = nums[midIdx];
				if (midIdxVal < target) {
					lowIdx = midIdx + 1;
				} else if (midIdxVal > target) {
					highIdx = midIdx - 1;
				} else {
					return midIdx;
				}
			}
		}
		return lowIdx;
	}

	public static void main(String[] args) {
		SearchInsertPosition35 s = new SearchInsertPosition35();
		System.out.println(s.searchInsert(new int[] { -9, -7, -5, -3, -1, 1, 3, 5, 7, 9 }, 4));
	}
}