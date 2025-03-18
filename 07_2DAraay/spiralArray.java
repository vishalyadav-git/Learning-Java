public class spiralArray {

    public static void printSpiral(int matrix[][]) {
        // Initialize boundaries
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;
    
        // While loop to traverse the matrix in spiral order
        while (startRow <= endRow && startCol <= endCol) {
            // Print the top row
            for (int i = startCol; i <= endCol; i++) {
                System.out.print(matrix[startRow][i] + " ");
            }
            startRow++;
    
            // Print the right column
            for (int i = startRow; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }
            endCol--;
    
            // Print the bottom row if there are remaining rows
            if (startRow <= endRow) {
                for (int i = endCol; i >= startCol; i--) {
                    System.out.print(matrix[endRow][i] + " ");
                }
                endRow--;
            }
    
            // Print the left column if there are remaining columns
            if (startCol <= endCol) {
                for (int i = endRow; i >= startRow; i--) {
                    System.out.print(matrix[i][startCol] + " ");
                }
                startCol++;
            }
        }
    }

    public static void main(String args[]){
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };
        printSpiral(matrix);
    }
}
