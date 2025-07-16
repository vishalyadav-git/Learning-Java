import java.util.*;
public class OperationsAL {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(1, 15);

        System.out.println(list);         // [10, 15, 20]
        System.out.println(list.get(1));  // 15

        list.set(1, 99);
        System.out.println(list);         // [10, 99, 20]

        list.remove(1);
        System.out.println(list);         // [10, 20]

        System.out.println(list.contains(20));  // true
        System.out.println(list.indexOf(20));   // 1

        // for loop
        for (int i = 0; i < list.size(); i++) {
        System.out.print(list.get(i) + " ");
        }
    }
}


