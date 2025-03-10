public class reverseArray {
    public static void reverse(int number[]){
        int first = 0;
        int  last = number.length-1;
        int temp = 0;
        while(first<last){
            temp = number[last];
            number[last] = number[first];
            number[first] = temp;
            first++;
            last--; 
        }

    }
    public static void main(String[] args) {
    int number[] = {2,3,4,5,6,7,8};
        reverse(number);
        for(int i=0; i < number.length; i++){
            System.out.print(number[i] + " "); 
        }
        System.out.println();
    }
}