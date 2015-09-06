import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromAnArray {

	private static Set<Integer> set = new HashSet<>();

	public static int[] duplicateIntegers(int[] array) {

		int[] newArray = new int[array.length];
		int count = 0;

		for (int element : array) {
			if (set.add(element)) {
				newArray[count++] = element;
			}
		}

		return Arrays.copyOf(newArray, count);

	}

	public static void main(String[] args) {
		int[] array = { 5, 6, 1, 2, 3, 3, 6, 1 };
		array = duplicateIntegers(array);
		System.out.println(Arrays.toString(array));
	}
}
