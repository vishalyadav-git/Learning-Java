public class PrintXpowN {
    public static int power(int x, int n){
        if(n == 1) return 2;
        int xPowNm1 = power(x, n-1);
        int xPowN = x * xPowNm1;
        return xPowN;
    }
    public static void main(String[] args) {
       System.out.println(power(2, 10));
    }
}
