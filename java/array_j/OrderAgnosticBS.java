
package JAVA.array_j;
import java.util.*;
import java.util.Scanner;

public class OrderAgnosticBS {
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
        System.out.println("Target found at index: "+OrderAgnosticBS(arr, target));
        
    }
    static int OrderAgnosticBS(int[] arr,int target){
        //inceasin order star < end
        int start = 0;
         int end = arr.length-1;
   boolean isAsc = arr[start] < arr[end];  //true or false
 

  
while(start<=end){
    int mid = start + (end - start) / 2;
    if (target==arr[mid]){
        return mid;
     }
     if (isAsc) {
        if (target>arr[mid]) {
            start=mid+1;
            
        }
        else  {
            end =mid-1;
            
        }
     }
     else{
        if (target<arr[mid]) {
            start=mid+1;
            
        }
        else  {
            end =mid-1;
            
        }

     }
    
    
        
    
}

    return -1;

    }

}