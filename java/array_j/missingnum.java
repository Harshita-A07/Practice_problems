package JAVA.array_j;

public class missingnum {


 // an array arr[] of size n - 1 that contains distinct integers in the range from 1 to n (inclusive).
 // This array represents a permutation of the integers from 1 to n with one element missing.
 // Your task is to identify and return the missing element.
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 5};
        // sum of first n numbers 
        // sum fo array of elements
        //diference between them we can get the missing number
        
     System.out.println(findMissing(arr));
    
    }
    public static int findMissing(int[] arr) {
        int n= arr.length+1;//since actual array is of size n-1
        int total = n*(n+1)/2; 
        int sum =0;
        for(int num :arr){
            sum=sum+num;
        }
        System.out.println(sum);
        System.out.println(total);
        return total-sum;
        }
}
