package hackerrank.easy;

/**
 * Hacker Rank Java > Data Structures
 * 
 * Java Generics {@link} https://www.hackerrank.com/challenges/java-generics
 * 
 * @author Amit Das
 */
public class DataStructuresJavaGenerics {

	public static <T> void printArray(T[] array) {
		for (T t : array) {
			System.out.println(t);
		}
	}

	public static void main(String[] args) {
		Integer[] intArray = { 1, 2, 3 };
		String[] stringArray = { "Hello", "World" };
		printArray(intArray);
		printArray(stringArray);
	}
}