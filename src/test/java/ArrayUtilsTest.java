import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ArrayUtilsTest {

    @Test
    public void testArrayNull() {
        assertEquals(-1, ArrayUtils.findLastIndex(null, 5, 0));
    }

    @Test
    public void testEmptyArray() {
        assertEquals(-1, ArrayUtils.findLastIndex(new int[]{}, 5, 0));
    }

    @Test
    public void testStartIndexNegative() {
        assertEquals(-1, ArrayUtils.findLastIndex(new int[]{1,2,3}, 2, -1));
    }

    @Test
    public void testStartIndexOutOfBounds() {
        assertEquals(2, ArrayUtils.findLastIndex(new int[]{1,2,3}, 3, 5));
    }

    @Test
    public void testValueFoundAtLastIndex() {
        assertEquals(4, ArrayUtils.findLastIndex(new int[]{1,2,3,2,5}, 5, 4));
    }

    @Test
    public void testValueNotFound() {
        assertEquals(-1, ArrayUtils.findLastIndex(new int[]{1,2,3,4}, 5, 3));
    }

    @Test
    public void testValueMultipleOccurrences() {
        assertEquals(3, ArrayUtils.findLastIndex(new int[]{1, 2, 2, 2}, 2, 3));
    }

    @Test
    public void testStartIndexMiddleOccurrence() {
        assertEquals(1, ArrayUtils.findLastIndex(new int[]{1,2,2,4}, 2, 1));
    }

    @Test
    public void testValueFoundAtFirstIndex() {
        assertEquals(0, ArrayUtils.findLastIndex(new int[]{7,2,3}, 7, 2));
    }

    @Test
    public void testValueFoundWithStartIndexZero() {
        assertEquals(-1, ArrayUtils.findLastIndex(new int[]{7,2,3}, 3, 0));
    }

    @Test
    public void testStartIndexEndsBeforeValueOccurs() {
        assertEquals(-1, ArrayUtils.findLastIndex(new int[]{1, 2, 3, 4, 2}, 2, 0));
    }

    @Test
    public void testNegativeNumbersInArray() {
        assertEquals(2, ArrayUtils.findLastIndex(new int[]{-3, -2, -3, -2}, -3, 3));
    }

    @Test
    public void testSingleElementArrayValueExists() {
        assertEquals(0, ArrayUtils.findLastIndex(new int[]{5}, 5, 0));
    }

    @Test
    public void testSingleElementArrayValueNotExists() {
        assertEquals(-1, ArrayUtils.findLastIndex(new int[]{3}, 5, 0));
    }

    @Test
    public void testZeroValueInArray() {
        assertEquals(3, ArrayUtils.findLastIndex(new int[]{0, 1, 0, 0}, 0, 3));
    }

    @Test
    public void testStartIndexEqualToArrayLength() {
        assertEquals(2, ArrayUtils.findLastIndex(new int[]{1, 2, 3}, 3, 3));
    }
    

    @Test
    public void testLargeArrayPerformance() {
        int[] largeArray = new int[1000];
        largeArray[500] = 10;
        assertEquals(500, ArrayUtils.findLastIndex(largeArray, 10, 999));
    }

}
