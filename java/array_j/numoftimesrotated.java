package java.array_j;
import java.util.*;
import java.util.Scanner;

public class numoftimesrotated {
    public static void main(String[] args) {
        int[] arr ={4,6,7,0,1,2,3};
        System.out.println(countRotations(arr));
    }
    private static int countRotations(int[] arr) {
        int pivot = rotated(arr);
        //pivot index
        System.out.println("minnimum in array is:");
        //even if it returns -1 i.e the array is not roatated (pivot not found)
        //-1 plus 1 =0 so it automatically returnsthe first element(min) of the sorted array
        return pivot + 1;
    }
    static int rotated(int[] arr){
            int start = 0;
            int end = arr.length - 1;
            while (start <= end) {
                int mid = start + (end - start) / 2;
                // 4 cases over here
                if (mid < end && arr[mid] > arr[mid + 1]) {
                    return mid;
                }
                if (mid > start && arr[mid] < arr[mid - 1]) {
                    return mid-1;
                }
                if (arr[mid] <= arr[start]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            return -1;
        }
        }

    



