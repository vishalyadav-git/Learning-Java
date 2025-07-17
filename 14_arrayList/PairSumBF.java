import java.util.ArrayList;

public class PairSumBF {
    public static boolean hasPairWithSum(ArrayList<Integer> list, int target) {
        int n = list.size();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (list.get(i) + list.get(j) == target) {
                    System.out.println("Pair found: (" + list.get(i) + ", " + list.get(j) + ")");
                    return true;
                }
            }
        }

        System.out.println("No pair found.");
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(6);
        list.add(8);
        list.add(9);

        int target = 10;

        hasPairWithSum(list, target);  // Output: Pair found: (1, 9)
    }
}
