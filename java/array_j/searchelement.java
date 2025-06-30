package JAVA.array_j;

import java.util.Scanner;

class searchElement {
    public static void main(String[] args) {
        int arr[]={2,3,4,5,32,333,211};
        System.out.println(searchElement(arr,5)+"th element");
    }
    public static int searchElement(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i+1;
            }
        }
        return -1;
    }
}


