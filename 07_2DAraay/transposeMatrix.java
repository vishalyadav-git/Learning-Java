public class transposeMatrix {
   
        public static void solution(int matrix[][] ){
            int r=3;
            int c=3;
            System.out.println("Matrix before Transpose");
            for(int i=0; i<r; i++){
                for(int j=0; j<c; j++){
                    System.out.print(matrix[i][j]+ " ");
                }
                System.out.println();
            }
            System.out.println("Matrix after Transpose");
            for(int i=0; i<c; i++){
                for(int j=0; j<r; j++){
                    System.out.print(matrix[j][i]+ " ");
                }
                System.out.println();
            }
    
        }
        public static void main(String args[]){
            int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
            };
            solution(matrix);
        }
    }

