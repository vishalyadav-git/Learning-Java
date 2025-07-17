public class ContainerBF {
    public static int maxArea(int[] height) {
        int maxWater = 0;

        // Try all possible pairs
        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int width = j - i;
                int currentHeight = Math.min(height[i], height[j]);
                int currentWater = width * currentHeight;
                maxWater = Math.max(maxWater, currentWater);
            }
        }

        return maxWater;
    }

    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println("Maximum water (Brute Force): " + maxArea(height));
    }
}

