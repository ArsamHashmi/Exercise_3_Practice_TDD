import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SumOfFirstKPositiveNumbersTest {

    @Test
    public void testSumWithPositiveNumbers() {
        int[] array = {-3, 1, 0, 2, -4, 3, 7, -2, 5};
        int k = 3;
        assertEquals(6, SumOfFirstKPositiveNumbers.sumOfFirstKPositiveNumbers(array, k));
    }

    @Test
    public void testSumWithEmptyArray() {
        int[] array = {};
        int k = 3;
        assertEquals(0, SumOfFirstKPositiveNumbers.sumOfFirstKPositiveNumbers(array, k));
    }

    @Test
    public void testSumWithSinglePositiveNumber() {
        int[] array = {5};
        int k = 1;
        assertEquals(5, SumOfFirstKPositiveNumbers.sumOfFirstKPositiveNumbers(array, k));
    }

    @Test
    public void testSumWithSingleNegativeNumber() {
        int[] array = {-5};
        int k = 1;
        assertEquals(0, SumOfFirstKPositiveNumbers.sumOfFirstKPositiveNumbers(array, k));
    }

    @Test
    public void testSumWithAllNegativeNumbers() {
        int[] array = {-1, -2, -3};
        int k = 2;
        assertEquals(0, SumOfFirstKPositiveNumbers.sumOfFirstKPositiveNumbers(array, k));
    }

    @Test
    public void testSumWithAllZeroes() {
        int[] array = {0, 0, 0, 0};
        int k = 3;
        assertEquals(0, SumOfFirstKPositiveNumbers.sumOfFirstKPositiveNumbers(array, k));
    }

    @Test
    public void testSumWithAllPositiveNumbers() {
        int[] array = {1, 2, 3, 4, 5};
        int k = 3;
        assertEquals(6, SumOfFirstKPositiveNumbers.sumOfFirstKPositiveNumbers(array, k)); // 1 + 2 + 3
    }

    @Test
    public void testSumWithPositiveAndNegativeNumbers() {
        int[] array = {1, -1, 2, 3, -2, 4};
        int k = 3;
        assertEquals(6, SumOfFirstKPositiveNumbers.sumOfFirstKPositiveNumbers(array, k)); // 1 + 2 + 3
    }

    @Test
    public void testSumWithPositiveNumbersAndZeros() {
        int[] array = {0, 1, 0, 2, 0, 3};
        int k = 3;
        assertEquals(6, SumOfFirstKPositiveNumbers.sumOfFirstKPositiveNumbers(array, k)); // 1 + 2 + 3
    }

    @Test
    public void testSumWithKGreaterThanArrayLength() {
        int[] array = {-3, 1, 0, 2, -4, 3, 7, -2, 5};
        int k = 10;
        assertEquals(18, SumOfFirstKPositiveNumbers.sumOfFirstKPositiveNumbers(array, k)); // 1 + 2 + 3
    }

    @Test
    public void testSumWithNegativeK() {
        int[] array = {-3, 1, 0, 2, -4, 3, 7, -2, 5};
        int k = -1;
        assertEquals(0, SumOfFirstKPositiveNumbers.sumOfFirstKPositiveNumbers(array, k));
    }
}
