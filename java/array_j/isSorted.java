package JAVA.array_j;

public class isSorted { 
    public static void main(String[] args) {
        int arr[] = {2, 3, 3, 4, 5, 6, 6};  // Removed extra comma
        boolean sorted = true;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                sorted = false;
                break;
            }
        }

        if (sorted)
            System.out.println("Array is sorted (non-decreasing).");
        else
            System.out.println("Array is NOT sorted.");
    }
}


