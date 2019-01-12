import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.Assert.assertArrayEquals;

public class RiverSizesTest {

    @Test
    public void TestCase1() {
        int[][] input = {{0}};

        Integer[] expected = {};
        ArrayList<Integer> output = RiverSizes.riverSizes(input);
        Collections.sort(output);
        assertArrayEquals(expected, output.toArray());
    }

    @Test
    public void TestCase2() {
        int[][] input = {{1}};

        Integer[] expected = {1};
        ArrayList<Integer> output = RiverSizes.riverSizes(input);
        Collections.sort(output);
        assertArrayEquals(expected, output.toArray());
    }

    @Test
    public void TestCase3() {
        int[][] input = {{1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 0}};

        Integer[] expected = {1, 2, 3};
        ArrayList<Integer> output = RiverSizes.riverSizes(input);
        Collections.sort(output);
        assertArrayEquals(expected, output.toArray());
    }

    @Test
    public void TestCase4() {
        int[][] input = {
                {1, 0, 0, 1},
                {1, 0, 1, 0},
                {0, 0, 1, 0},
                {1, 0, 1, 0}
        };

        Integer[] expected = {1, 1, 2, 3};
        ArrayList<Integer> output = RiverSizes.riverSizes(input);
        Collections.sort(output);
        assertArrayEquals(expected, output.toArray());
    }

    @Test
    public void TestCase5() {
        int[][] input = {
                {1, 0, 0, 1, 0},
                {1, 0, 1, 0, 0},
                {0, 0, 1, 0, 1},
                {1, 0, 1, 0, 1},
                {1, 0, 1, 1, 0},
        };

        Integer[] expected = {1, 2, 2, 2, 5};
        ArrayList<Integer> output = RiverSizes.riverSizes(input);
        Collections.sort(output);
        assertArrayEquals(expected, output.toArray());
    }
}