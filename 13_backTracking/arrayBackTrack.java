public class arrayBackTrack {
    public static void changeArr(int arr[], int i, int val){
        if(i == arr.length){
            printArr(arr);
            return;
        }
        arr[i] = val;

        // Recursive call with next index and next value
        changeArr(arr, i + 1, val + 1);

        // Backtracking step
        arr[i] = arr[i] - 2;
    }

    public static void printArr(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = new int[5];
        changeArr(arr, 0, 1);
        printArr(arr);
    }
}
