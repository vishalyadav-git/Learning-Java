import java.util.ArrayList;

public class SwapInArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // Add some elements
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println("Before Swap: " + list);

        // Swap elements at index 1 and 3
        int i = 1;
        int j = 3;

        // Method 1: Manual Swap
        int temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);

        
        System.out.println("After Swap : " + list);
    }
}

