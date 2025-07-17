import java.util.ArrayList;
import java.util.Collections;

public class PairSum {

    public static boolean hasPairWithSum(ArrayList<Integer> list, int target) {
        // Make sure the list is sorted
        Collections.sort(list);

        int left = 0;
        int right = list.size() - 1;

        while (left < right) {
            int sum = list.get(left) + list.get(right);

            if (sum == target) {
                System.out.println("Pair found: (" + list.get(left) + ", " + list.get(right) + ")");
                return true;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        System.out.println("No pair found.");
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(8);
        list.add(1);
        list.add(4);
        list.add(6);
        list.add(9);

        int target = 10;

        hasPairWithSum(list, target); 
    }
}

