package java.array_j;
import java.util.*;
import java.util.Scanner;

public class Binary_search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[7];
        System.out.print("Enter arr: ");
        for(int i=0; i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter target :");
        int target =sc.nextInt();
        sc.close();
        System.out.println("Target found at index: "+binary(arr, target));
        
    }
static int binary(int[] arr,int target){
int start = 0;
int end = arr.length-1;
// find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
while(start<=end){
    int mid = start + (end - start) / 2;

    if (target>arr[mid]) {
        start=mid+1;
        
    }
    else if (target<arr[mid]) {
        end =mid-1;
        
    }
    else{
        return mid;
        // arr[mid];
    }
}

    return -1;
}


}
