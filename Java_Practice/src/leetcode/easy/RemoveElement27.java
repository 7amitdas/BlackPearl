package leetcode.easy;

/**
 * LeetCode Problems
 * 
 * 27. Remove Element Solution 1 </br>
 * {@link} https://leetcode.com/problems/remove-element
 * 
 * @author Amit Das
 */
public class RemoveElement27 {

	public int removeElement(int[] nums, int val) {
		int rmIndex = 0;
		for (int num : nums) {
			if (num != val) {
				nums[rmIndex] = num;
				rmIndex++;
			}
		}
		return rmIndex;
	}

	public static void main(String[] args) {
		RemoveElement27 t = new RemoveElement27();
		System.out.println(t.removeElement(new int[] { 0, 2, 3, 4, 5, 3, 1, 0 }, 3));
	}
}