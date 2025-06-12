package array_j;

import java.util.*;

public class swapp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("enter the positions to be swapped");
        System.out.print("enter the position one");
        int pos1 = sc.nextInt();
        System.out.print("enter the position two");
        int pos2 = sc.nextInt();
        System.out.print("enter the array:");
      for(int i=0;i<5;i++)
      {
        arr[i]=sc.nextInt();
             }
            swap(arr,pos1,pos2);
            System.out.println(Arrays.toString(arr));

    }
     static void swap(int[] arr,int pos1,int pos2){
       
       for(int i=0;i<arr.length;i++){
        int temp =arr[pos1-1];
        arr[pos1-1]=arr[pos2-1];
        arr[pos2-1]=temp;
       }

       
    }
}
