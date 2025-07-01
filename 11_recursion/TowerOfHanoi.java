public class TowerOfHanoi {

    public static void solve(int n, String src, String helper, String dest) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + src + " to " + dest);
            return;
        }

        // Step 1: Move n-1 disks from src to helper
        solve(n - 1, src, dest, helper);

        // Step 2: Move nth disk from src to dest
        System.out.println("Move disk " + n + " from " + src + " to " + dest);

        // Step 3: Move n-1 disks from helper to dest
        solve(n - 1, helper, src, dest);
    }

    public static void main(String[] args) {
        int n = 3;
        solve(n, "A", "B", "C"); // A = source, B = helper, C = destination
    }
}

