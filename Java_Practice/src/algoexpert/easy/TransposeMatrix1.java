package algoexpert.easy;

import java.util.Arrays;

/**
 * Coding Interview Questions Transpose Matrix Solution 1
 * {@link} https://www.algoexpert.io/questions/transpose-matrix
 * 
 * @author Amit Das
 */
public class TransposeMatrix1 {

	public int[][] transposeMatrix(int[][] matrix) {
		// Write your code here.
		int[][] transposeMatrix = new int[matrix[0].length][matrix.length];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				transposeMatrix[j][i] = matrix[i][j];
			}
		}
		return transposeMatrix;
	}

	public static void main(String[] args) {
		TransposeMatrix1 t = new TransposeMatrix1();
		int[][] matrix1 = new int[][] { { 1, 2 } };
		int[][] matrix2 = new int[][] { { 1, 2 }, { 3, 4 }, { 5, 6 } };
		int[][] matrix3 = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		System.out.println(Arrays.deepToString(t.transposeMatrix(matrix1)));
		System.out.println(Arrays.deepToString(t.transposeMatrix(matrix2)));
		System.out.println(Arrays.deepToString(t.transposeMatrix(matrix3)));
	}
}