public class kadane {
    public static void kadaneAlgo(int number[]){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for(int i=0; i<number.length; i++){
            currSum = currSum + number[i];
            if(currSum > maxSum){
                maxSum = currSum;
            }
        }
        System.out.println("max of subArray is: " +maxSum);
    }
    public static void main(String[] args) {
       int number[] = {2,3,-5,4,6,-7};
        kadaneAlgo(number);
    }
}