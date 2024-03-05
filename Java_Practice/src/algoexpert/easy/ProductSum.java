package algoexpert.easy;

import java.util.List;

/**
 * Coding Interview Questions </br>
 * Product Sum Solution 1 </br>
 * {@link} https://www.algoexpert.io/questions/product-sum
 * 
 * @author Amit Das
 */
public class ProductSum {

	public static int productSum(List<Object> array) {
		// Write your code here.
		return productSum(array, 1);
	}

	public static int productSum(List<Object> array, Integer level) {
		// Write your code here.
		Integer productSum = 0;
		for (Object object : array) {
			if (object instanceof List<?>) {
				productSum = productSum + productSum((List<Object>) object, level + 1);
			} else {
				productSum = productSum + (Integer) object;
			}
		}
		return productSum * level;
	}

	public static void main(String[] args) {
		ProductSum p = new ProductSum();
		System.out.println(p.productSum(List.of(5, 2, List.of(7, -1), 3, List.of(6, List.of(-13, 8), 4)), 1));
	}
}