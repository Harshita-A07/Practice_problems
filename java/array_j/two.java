package JAVA.array_j;
import java.util.*;
public class two {
    // public static void main(String[] args) {
    //     int [] [] dd = {{1,2,3},{23,5,45},{21,22,13,44}};
    //     for(int i=0;i< dd.length;i++){
    //         for(int j=0;j<dd[i].length;j++){
    //             if(dd[i][j]==45){
    //                System.out.println(dd[i][j]);
    //                System.out.print("position:"+i+" "+j);
    //             }
    //         }
    //     }
    // }
    public static void main(String[] args) {
        int[][] arr = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50} 
        };

        int[] n=search(arr, 40);
        System.out.println(Arrays.toString(n));
    }

    // static int[] search(int[][] matrix, int target) {
    //     int r = 0;
    //     int c = matrix[0].length - 1;

    //     while (r < matrix.length && c >= 0) {
    //         if (matrix[r][c] == target) {
    //             return new int[]{r, c};
    //         }
    //         if (matrix[r][c] < target) {
    //             r++;
    //         } else {
    //             c--;
    //         }
    //     }
    //     return new int[]{-1, -1};
    // }
    static int[] search(int[][] arr,int target){
        int start = 0;
        int n = arr.length; // Number of rows
        int m = arr[0].length; // Number of columns

        int end = n * m - 1;;
        
        while(start<=end){
            int mid = start + (end - start) / 2;
            int row = mid / m;
            int col = mid % m;
            if(arr[row][col]==target){
                return new int[]{row,col};
            }
            else if(arr[row][col]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        
            return new int[]{-1,-1};
        }
        
}
    

