public class GridWays {
    public static int countWays(int i, int j, int m, int n) {
        // Base Case: If we reach the last cell
        if (i == m - 1 && j == n - 1) {
            return 1;
        }

        // If we go out of bounds
        if (i >= m || j >= n) {
            return 0;
        }

        // Move right and down
        int rightWays = countWays(i, j + 1, m, n);
        int downWays = countWays(i + 1, j, m, n);

        return rightWays + downWays;
    }

    public static void main(String[] args) {
        int m = 3, n = 3;
        System.out.println("Total ways = " + countWays(0, 0, m, n));
    }
}

