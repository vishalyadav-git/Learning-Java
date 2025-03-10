public class maxSubarray {
    
        public static void maxArray(int number[]){
            int maxArrayVAl = Integer.MIN_VALUE;
            int currVAl = 0;
            for(int i=0; i<number.length; i++){
                int start = i;
                for(int j=i; j<number.length; j++){
                    int end = j;
                    for(int k=start; k<=end; k++){
                         currVAl += number[k];
                    }
                    System.out.println(currVAl);
                    if(currVAl > maxArrayVAl){
                        maxArrayVAl = currVAl;
                    }
                }    
            }
            System.out.println("max value is: " +maxArrayVAl);
        }
        public static void main(String[] args) {
            int number[] = {2,3,4,5,6,7};
            maxArray(number);
        }
    }
    

