import java.util.Scanner;
public class insertionsrt {
    public static void main(String[] args) {
        int[] arr={1,5,2,4,3};
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        printarr(arr);
    }
    static void printarr(int[] arr){
        for (int i =0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    
}
