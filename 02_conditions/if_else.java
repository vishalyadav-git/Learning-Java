import java.util.*;

public class if_else{
    public static void main(String args[]){
        int age = 10;
        if(age >= 18){
            System.out.println("u r adult");
        }
        else if (age<=17 && age>= 13) {
            System.out.println("u r teenage");
        }
        else{
            System.out.println("u r not adult nor teenage");
        }
    }
}