public class tilingProblem {
    public static int tilingProblem(int n) {
    // Base case
    if (n == 0 || n == 1) {
        return 1;
    }

    // Vertical choice: place tile vertically
    int fnm1 = tilingProblem(n - 1);

    // Horizontal choice: place 2 tiles horizontally
    int fnm2 = tilingProblem(n - 2);

    // Total ways
    int totWays = fnm1 + fnm2;
    return totWays;
}
    public static void main(String[] args) {
        System.out.println(tilingProblem(4));
    }
}
