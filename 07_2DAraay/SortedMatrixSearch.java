public class SortedMatrixSearch {
    public static int[] searchInMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int row = 0, col = cols - 1; // Start from top-right corner

        while (row < rows && col >= 0) {
            if (matrix[row][col] == target) {
                return new int[]{row, col}; // Found target
            } else if (matrix[row][col] > target) {
                col--; // Move left
            } else {
                row++; // Move down
            }
        }

        // Target not found
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int matrix[][] = {
            {1, 4, 7, 11},
            {2, 5, 8, 12},
            {3, 6, 9, 16},
            {10, 13, 14, 17}
        };
        
        int target = 5;
        int result[] = searchInMatrix(matrix, target);
        System.out.println("Position of target: (" + result[0] + ", " + result[1] + ")");
        
        target = 15;
        result = searchInMatrix(matrix, target);
        System.out.println("Position of target: (" + result[0] + ", " + result[1] + ")");
    }
}
