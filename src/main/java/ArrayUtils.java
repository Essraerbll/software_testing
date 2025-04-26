public class ArrayUtils{

    /**
	 * Finds the last index of the given value in the array starting at the given
	 * index.
     * 
	 * A negative startIndex will return -1.
	 * startIndex larger than the array length will search from the end of the array.
	 *
	 * @param array
	 *            the array to traverse for looking for the object, may be null
	 * @param value
	 *            the value to find
	 * @param startIndex
	 *            the start index to traverse backwards from
	 * @return the last index of the value within the array,
	 *         -1 if not found or null array input
	 */

    public static int findLastIndex(int[] array, int value, int start) {
		if (array == null) {
			return -1;
		}
		if (start < 0) {
			return -1;
		} else if (start >= array.length) {
			start = array.length - 1;
		}
		for (int i = start; i >= 0; i--) {
			if (value == array[i]) {
				return i;
			}
		}
		return -1;
	}
}

