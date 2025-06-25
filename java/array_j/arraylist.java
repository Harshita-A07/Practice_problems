package JAVA.array_j;
import java.util.*;
import java.util.ArrayList;

// ArrayList
// Definition: A resizable, single-dimensional collection of elements.
// Structure: Holds elements in a linear (one-dimensional) order.
// Data Storage: Each element is stored at a single index.
// Usage: Ideal for storing and managing a simple list of elements.


public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(2);
        ArrayList<Integer> newarr = new ArrayList<>();
        // arr.add(12);
        // arr.add(90);
        // arr.add(210);
        // arr.add(231);
        // to get inpurt
        Scanner sc = new Scanner(System.in);
        for(int i =0;i<5;i++){
            newarr.add(sc.nextInt());
        }
        sc.close();
        //check if it is present in array or not 
        // System.out.println(arr.contains(12));
        // System.out.println(arr);
        // System.out.println(arr.remove(1));//element at index 1 is removed
        // System.out.println("array items");
       //to print arraylist 
        for(int i =0;i<10;i++){
            //System.out.println(arr.get(i));
            System.out.println(newarr.get(i));
        } 
        
                    //or
        //System.out.println(arr);
    }
}
