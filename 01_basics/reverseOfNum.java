public class reverseOfNum {
    public static void main(String args[]){
        int num = 21082004;
        while(num > 0){
            int lastDigit = num%10;
            System.out.println(lastDigit);
            num = num/10;
        }
    }
}
