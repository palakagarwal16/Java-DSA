package ARRAYS;

public class
matrixzero {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int[] row = new int[m]; // Tracks which rows need to be zeroed
        int[] col = new int[n]; // Tracks which columns need to be zeroed

        // Step 1: Mark rows and columns
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {  // ✅ use '==' for comparison
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }

        // Step 2: Set cells to zero if their row or column is marked
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (row[i] == 1 || col[j] == 1) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}


