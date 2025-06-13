package java;

import java.util.Arrays;

public class nextpermutation {
    public static void main(String[] args) {
        int [] arr ={2,1,5,4,3,0,0};
        System.out.println("original");
        System.out.println(Arrays.toString(arr));
       permutation(arr); 
       System.out.println("Next permutation");
       System.out.println(Arrays.toString(arr));
           }
        public static void permutation(int[] arr){
        int id1=-1;
        int id2=-1;
        // find the break point
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                id1=i;
                break;
            }
        }
        // if therese no break point just reverse alone
        if(id1==-1){
            reverse(arr,0);
        }
        else{
        //find the greatest next to reak point
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]>arr[id1]){
                id2=i;
                break;
            }
        }
        //after finding bp and greates
        // swap that numners 
         swap(arr,id1,id2);
                // reverse the elements in the right
                reverse(arr,id1+1);
            }
            }
        
            static void swap(int [] arr,int i,int j){
       int temp=arr[i];
       arr[i]=arr[j];
       arr[j]=temp;
    }
    static void reverse(int [] arr,int start){
        int i=start;
        int j=arr.length-1;
        while(i<j){
        swap(arr,i,j);
        i++;
        j--;
        }
    }
    
}
