import java.util.LinkedList;
import java.util.Queue;

public class FirstNonRepeating {
     public static void main(String[] args) {
        String str = "aabccxb"; 
        findFirstNonRepeating(str);
    }

    public static void findFirstNonRepeating(String str) {
        int freq[] = new int[26]; // to store frequency of each character
        Queue<Character> q = new LinkedList<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // add character to queue
            q.add(ch);
            freq[ch - 'a']++;

            // remove all repeating characters from queue 
            while (!q.isEmpty() && freq[q.peek() - 'a'] > 1) {
                q.remove();
            }

            if (q.isEmpty()) {
                System.out.print(-1 + " ");
            } else {
                System.out.print(q.peek() + " ");
            }
        }
    }
}
