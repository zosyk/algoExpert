import org.junit.Test;

import static org.junit.Assert.*;

public class LargestRangeTest {

    @Test
    public void TestCase1() {
        int[] expected = {1, 1};

        assertArrayEquals(expected, LargestRange.largestRange(new int[]{1}));
    }

    @Test
    public void TestCase2() {
        int[] expected = {1, 2};

        assertArrayEquals(expected, LargestRange.largestRange(new int[]{2, 1}));
    }

    @Test
    public void TestCase3() {
        int[] expected = {1, 4};

        assertArrayEquals(expected, LargestRange.largestRange(new int[]{4, 2, 1, 3}));
    }

    @Test
    public void TestCase4() {
        int[] expected = {1, 4};

        assertArrayEquals(expected, LargestRange.largestRange(new int[]{4, 2, 1, 3, 6}));
    }

    @Test
    public void TestCase7() {
        int[] expected = {10, 19};

        assertArrayEquals(expected, LargestRange.largestRange(new int[]{19, -1, 18, 17, 2, 10, 3, 12, 5, 16, 4, 11, 8, 7, 6, 15, 12, 12, 2, 1, 6, 13, 14}));
    }
}