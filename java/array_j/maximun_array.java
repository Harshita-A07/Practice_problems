package JAVA.array_j;
import java.util.Scanner;

public class maximun_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.print("enter the size of the array :");
        int n = sc.nextInt();
        System.out.print("enter the array:");
      for(int i=0;i<n;i++)
      {
        arr[i]=sc.nextInt();
             }
          System.out.println(maximum(arr));   
    }
    public static int maximum(int[] arr){
    int max = arr[0];
    for(int i=0;i<arr.length;i++){
        if(arr[i]>max){
            max = arr[i];
        }
    }
    return max;
}
}
