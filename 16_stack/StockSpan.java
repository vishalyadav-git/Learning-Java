import java.util.*;


public class StockSpan {

    public static int[] calculateSpan(int[] prices) {
        int n = prices.length;
        int span[] = new int[n];
        Stack<Integer> s = new Stack<>();

        span[0] = 1; 
        s.push(0);    // Push index of first day

        for (int i = 1; i < n; i++) {
            // Pop elements from the stack while the current price is higher
            while (!s.isEmpty() && prices[i] >= prices[s.peek()]) {
                s.pop();
            }

            // If stack is empty, all previous prices are smaller
            if (s.isEmpty()) {
                span[i] = i + 1;
            } else {
                span[i] = i - s.peek();
            }

            // Push current index
            s.push(i);
        }

        return span;
    }

    public static void main(String[] args) {
        int prices[] = {100, 80, 60, 70, 60, 75, 85};
        int span[] = calculateSpan(prices);

        System.out.println("Stock Span:");
        for (int sp : span) {
            System.out.print(sp + " ");
        }
    }
}


