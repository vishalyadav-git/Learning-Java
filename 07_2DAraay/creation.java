import java.util.*;
// 2D Array
public class creation {
    // public static boolean create(int matrix[][]){

    // }
   public static void main(String[] args) {
    int matrix[][] = new int[3][3];
    int n = 3; int m =3;
    // input
    Scanner sc = new Scanner(System.in);
    for(int i=0; i<n; i++){
        for(int j=0; j<n; j++){
            matrix[i][j] = sc.nextInt();
        }
    }

    // output
    for(int i=0; i<n; i++){
        for(int j=0; j<n; j++){
            System.out.print(matrix[i][j] +" ");
            }
            System.out.println();
        }
   } 
}
