import java.util.Stack;

public class MaxRectangleHistogram {
    public static int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] nsr = new int[n]; // next smaller right
        int[] nsl = new int[n]; // next smaller left

        Stack<Integer> s = new Stack<>();

        // NSR
        for (int i = n - 1; i >= 0; i--) {
            while (!s.isEmpty() && heights[s.peek()] >= heights[i]) {
                s.pop();
            }
            nsr[i] = s.isEmpty() ? n : s.peek();
            s.push(i);
        }

        // clear stack for NSL
        s.clear();

        // NSL
        for (int i = 0; i < n; i++) {
            while (!s.isEmpty() && heights[s.peek()] >= heights[i]) {
                s.pop();
            }
            nsl[i] = s.isEmpty() ? -1 : s.peek();
            s.push(i);
        }

        // max area
        int maxArea = 0;
        for (int i = 0; i < n; i++) {
            int width = nsr[i] - nsl[i] - 1;
            int area = heights[i] * width;
            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
    }

    public static void main(String[] args) {
        int[] heights = {2, 1, 5, 6, 2, 3};
        System.out.println("Max Area: " + largestRectangleArea(heights)); 
    }
}
