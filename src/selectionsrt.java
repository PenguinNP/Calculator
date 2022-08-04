import java.util.Scanner;
public class selectionsrt {
    static void printarr(int[] arr){
        for (int i =0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    static int[] arr(){
        Scanner sc = new Scanner(System.in);
        int a;
        a = sc.nextInt();
        int[] arr = new int[a];
        for ( int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr =arr();
        for (int i=0;i<arr.length-1;i++){
            int smallest =i;
            for (int j=i+1;j<arr.length;j++){
                if (arr[smallest]>arr[j]){
                    smallest=j;
                }
                int temp = arr[smallest];
                arr[smallest] =arr[i];
                arr[i]=temp;
            }
        }
        printarr(arr);
    }
}
