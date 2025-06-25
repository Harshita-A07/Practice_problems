package JAVA.array_j;

import java.util.HashSet;

//remove duplicate in-place from sorted array
public class remduplicate {
    public static void main(String[] args) {


       

       int arr[] ={1,1,3,4,4,7,8,8,8,8,9,9,9,9};
      
       int newLength = removeDuplicates(arr);

        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    //bruteforce
    //    HashSet<Integer> set = new HashSet<>();
    //    for(int i=0;i<arr.length;i++){
    //        set.add(arr[i]);
    //    }

       //time complexity: n log n

    //    int i=0;
    //    for(int num:set){
    //     arr[i]=num;
    //     i++;
    //    }
       //time : O(N)

   //TIME COMPLEXITY=  n log n +n
   //space complexity: O(N)

   //OPTIMIZED
   //considering two pointers where i=0 and j=1
    public static int removeDuplicates(int[] arr) {
  
    
        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[i]!=arr[j])
            {
                arr[i+1]=arr[j];
                 i++;

            }
        }
        return i+1;// new length
        

         
     }
// Time Complexity: O(n)
       
    }
    

