import java.util.Arrays;

public class ShiftGrid{
    public static int[][] shiftGrid(int[][]grid, int k){
        int m = grid.length;   // Number of rows
        int n = grid[0].length;  // Number of cols
        int total = m * n;

        k = k % total;   // Remove extra shifts

        int newGrid[][] = new int[m][n];

        for(int row = 0; row<n;row++){
            for(int col = 0;col<n;col++){
                // Convert row & col into a single index
                int oldIndex = row * n + col;

                // Find the new index after shifting
                int newIndex = (oldIndex + k) % total;

                // Convert new index back to row & column
                int newRow = newIndex / n;
                int newCol = newIndex % n;

                // Place the element
                newGrid[newRow][newCol] = grid[row][col];
            }
        }

        return newGrid;
    }
    public static void main(String[] args) {
        int[][] grid = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int k = 1;

        int[][]ans = shiftGrid(grid, k);

        for(int i=0;i<ans.length;i++){
            System.out.println(Arrays.toString(ans[i]));
        }
    }
}