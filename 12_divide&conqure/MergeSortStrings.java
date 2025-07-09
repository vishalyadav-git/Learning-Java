public class MergeSortStrings {

    // Merge Sort function
    public static void mergeSort(String[] arr, int si, int ei) {
        if (si >= ei) {
            return;
        }

        int mid = si + (ei - si) / 2;

        mergeSort(arr, si, mid);        // left part
        mergeSort(arr, mid + 1, ei);    // right part
        merge(arr, si, mid, ei);        // merge both
    }

    // Merge function
    public static void merge(String[] arr, int si, int mid, int ei) {
        // Create a temp array to store merged result
        String[] temp = new String[ei - si + 1];
        int i = si;       // pointer for left part
        int j = mid + 1;  // pointer for right part
        int k = 0;        // pointer for temp array

        while (i <= mid && j <= ei) {
            if (arr[i].compareTo(arr[j]) < 0) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        // Copy remaining elements
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // Copy temp array back to original array
        for (int x = 0; x < temp.length; x++) {
            arr[si + x] = temp[x];
        }
    }

    // Print array
    public static void printArr(String[] arr) {
        for (String s : arr) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        String[] arr = { "sun", "earth", "mars", "mercury" };

        mergeSort(arr, 0, arr.length - 1);
        System.out.println("Sorted array:");
        printArr(arr);
    }
}

