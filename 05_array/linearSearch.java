import java.util.*;
public class linearSearch {

    public static int search(int number[], int keys){
        for(int i=0; i<=number.length; i++){
            if(number[i] == keys){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int number[] = {12, 14, 16, 15, 20, 51, 10};
        int keys = 10;
        int index = search(number, keys);
        if(index == -1){
            System.out.println("Not found");
        }else{
            System.out.println("index of element: " +index);
        }
       
    }
}
