import java.util.ArrayList;
import java.util.Arrays;

class RiverSizes {
    public static ArrayList<Integer> riverSizes(int[][] matrix) {
        int[][] copy = Arrays.copyOf(matrix, matrix.length);
        ArrayList<Integer> result = new ArrayList<Integer>();
        for(int y = 0; y< copy.length; y++) {
            int[] row = copy[y];
            for(int x = 0; x < row.length; x++) {
                if(row[x] == 1) {
                    result.add(getRiverSizes(y, x, copy));
                }
            }
        }
        return result;
    }

    private static Integer getRiverSizes(int y, int x, int[][] copy) {
        if(y < 0 || x < 0 || y >= copy.length || x >= copy[y].length || copy[y][x] != 1) {
            return 0;
        }
        copy[y][x] = 2;// passed path
        return 1 +
                getRiverSizes(y + 1, x, copy) +
                getRiverSizes(y, x + 1, copy) +
                getRiverSizes(y-1, x, copy) +
                getRiverSizes(y, x -1, copy);
    }
}
