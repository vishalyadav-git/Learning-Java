public class sudoku {

    public static boolean isSafe(int[][] board, int row, int col, int num) {
        // check row
        for (int j = 0; j < 9; j++) {
            if (board[row][j] == num) return false;
        }

        // check column
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == num) return false;
        }

        // check 3x3 grid
        int startRow = (row / 3) * 3;
        int startCol = (col / 3) * 3;
        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (board[i][j] == num) return false;
            }
        }

        return true;
    }

    public static boolean solveSudoku(int[][] board, int row, int col) {
        // if we reach past the last row
        if (row == 9) {
            return true;
        }

        // if we reach end of column, go to next row
        if (col == 9) {
            return solveSudoku(board, row + 1, 0);
        }

        // if cell already filled, go to next cell
        if (board[row][col] != 0) {
            return solveSudoku(board, row, col + 1);
        }

        // try all digits
        for (int num = 1; num <= 9; num++) {
            if (isSafe(board, row, col, num)) {
                board[row][col] = num;

                if (solveSudoku(board, row, col + 1)) {
                    return true;
                }

                board[row][col] = 0; // backtrack
            }
        }

        return false; // no valid number found
    }

    public static void printBoard(int[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] board = {
            {5, 3, 0, 0, 7, 0, 0, 0, 0},
            {6, 0, 0, 1, 9, 5, 0, 0, 0},
            {0, 9, 8, 0, 0, 0, 0, 6, 0},
            {8, 0, 0, 0, 6, 0, 0, 0, 3},
            {4, 0, 0, 8, 0, 3, 0, 0, 1},
            {7, 0, 0, 0, 2, 0, 0, 0, 6},
            {0, 6, 0, 0, 0, 0, 2, 8, 0},
            {0, 0, 0, 4, 1, 9, 0, 0, 5},
            {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };

        if (solveSudoku(board, 0, 0)) {
            System.out.println("Sudoku Solved Successfully:");
            printBoard(board);
        } else {
            System.out.println("Sudoku cannot be solved.");
        }
    }
}


