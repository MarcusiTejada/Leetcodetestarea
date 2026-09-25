package Easy_difficulty;

public class MinimumOperationstoMakeColumnsStrictlyIncreasing {
    public int minimumOperations(int[][] grid) {
        int total = 0;

        for (int i = 0; i < grid[0].length; i++) {
            int temp = grid[0][i];
            for (int j = 1; j < grid.length; j++) {
                if (temp == grid[j][i]) {
                    total++;
                    temp++;
                } else if (temp > grid[j][i]) {
                    total += (temp - grid[j][i] + 1);
                    temp++;
                } else {
                    temp = grid[j][i];
                }
            }
        }

        return total;
    }
}
