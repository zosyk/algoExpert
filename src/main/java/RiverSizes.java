import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * O(wh) time | O(wh) space, w - width, h - height of matrix
 * */
class RiverSizes {
    public static ArrayList<Integer> riverSizes(int[][] matrix) {
        boolean[][] visited = new boolean[matrix.length][matrix[0].length];

        ArrayList<Integer> sizes = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            int[] row = matrix[i];
            for (int j = 0; j < row.length; j++) {
                if (visited[i][j])
                    continue;

                traverseNodes(i, j, matrix, visited, sizes);
            }
        }
        return sizes;
    }

    private static void traverseNodes(int i, int j, int[][] matrix, boolean[][] visited, ArrayList<Integer> sizes) {
        int currentRiversSize = 0;
        Stack<Integer[]> nodesToExplore = new Stack<>();
        nodesToExplore.push(new Integer[]{i, j});


        while (!nodesToExplore.empty()) {
            Integer[] node = nodesToExplore.pop();
            i = node[0];
            j = node[1];

            if (visited[i][j])
                continue;
            visited[i][j] = true;
            if (matrix[i][j] == 0)
                continue;

            currentRiversSize++;

            for (Integer[] n : getUnvisitedNeighbors(i, j, matrix, visited)) {
                nodesToExplore.push(n);
            }
        }

        if (currentRiversSize > 0) {
            sizes.add(currentRiversSize);
        }
    }

    private static void printArr(boolean[][] visited, int[][] matrix) {
        System.out.println();
        for(boolean[] row: visited) {
            System.out.println(Arrays.toString(row));
        }
        for(int[] row1: matrix) {
            System.out.println(Arrays.toString(row1));
        }
        System.out.println();
    }

    private static List<Integer[]> getUnvisitedNeighbors(int i, int j, int[][] matrix, boolean[][] visited) {
        List<Integer[]> nodes = new ArrayList<>();

        if (i + 1 < matrix.length && !visited[i + 1][j])
            nodes.add(new Integer[]{i + 1, j});
        if (j + 1 < matrix[i].length && !visited[i][j + 1])
            nodes.add(new Integer[]{i, j + 1});
        if (i - 1 >= 0 && !visited[i - 1][j])
            nodes.add(new Integer[]{i - 1, j});
        if (j - 1 >= 0 && !visited[i][j - 1])
            nodes.add(new Integer[]{i, j - 1});

        return nodes;
    }
}
