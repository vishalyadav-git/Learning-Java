public class numberOfOne {
    public static int hammingWeight(int n) {
       int count = 0;
       while(n>0){
        if((n & 1)==0){
           n = n>>1;
        }
        else{
            count++;
        }
       }
       return count; 
    }
    public static void main(String args[]){
        int n= 11;
        System.out.println(hammingWeight(n));
    }
}