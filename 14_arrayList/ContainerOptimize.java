public class ContainerOptimize {
    
    public static int maxArea(int[] height) {
        int maxWater = 0;
        int left = 0, right = height.length - 1;

        while (left < right) {
            int width = right - left;
            int currentHeight = Math.min(height[left], height[right]);
            int currentWater = width * currentHeight;
            maxWater = Math.max(maxWater, currentWater);

            // Move the pointer pointing to the shorter line
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxWater;
    }

    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println("Maximum water: " + maxArea(height));
    }
}


