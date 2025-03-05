// without function

// import java.util.*;
// public class hollowRec {
//     public static void main(String[] args) {
//         for(int i = 1; i <=4; i++){
//             for(int j = 1; j <=5;j++){
//                 if(i==1 || i==4 || j==1 || j==5){
//                     System.out.print("*");
//                 }else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
    
// }

// with function

import java.util.*;

public class hollowRec {
    public static void hollow_rectangle(int noRow, int noCol){
        // outer loop
        for(int i=1; i <= noRow; i++){
            // inner loop
            for(int j=1; j<=noCol; j++){
                if (i==1|| i==noRow || j ==1 || j==noCol) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }System.out.println();
        }

    }
    public static void main(String[] args) {
        hollow_rectangle(5, 7);
    }
}