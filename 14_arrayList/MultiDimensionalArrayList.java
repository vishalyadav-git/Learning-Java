import java.util.*;

public class MultiDimensionalArrayList {
    public static void main(String[] args) {
        
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

        // Create 3 inner lists
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        // Fill inner lists
        for (int i = 1; i <= 5; i++) {
            list1.add(i);        
            list2.add(i * 2);    
            list3.add(i * 3);    
        }

        // Add inner lists to mainList
        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);

        // Print mainList using simple print
        System.out.println("mainList = " + mainList);

      
        System.out.println("Formatted Output:");
        for (int i = 0; i < mainList.size(); i++) {
            ArrayList<Integer> currList = mainList.get(i);
            for (int j = 0; j < currList.size(); j++) {
                System.out.print(currList.get(j) + " ");
            }
            System.out.println();
        }
    }
}

