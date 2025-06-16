package JAVA.array_j;
import java.util.*;
public class multi_dimen
 {

// Definition: A resizable, nested collection where each element is itself an ArrayList.
// Structure: Represents a table-like (multi-dimensional) structure.
// Data Storage: Each row is an ArrayList, and rows collectively form the multidimensional list.
 //Usage: Suitable for dynamic storage of tabular or matrix-like data.
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        ArrayList<ArrayList<Integer>> arr1 = new ArrayList<>();
       
        //initialisation
        for(int i=0; i<3;i++){
            arr1.add(new ArrayList<>());
        } 

        // from above
        // i<3 -> [ [0],[1],[2]] 3 arrays are initialised

        // add elements
        System.out.println("enter the elements");
        for (int i=0;i<3;i++) // for each internal arrays initialised above
        {
            for(int j=0;j<2;j++){
                arr1.get(i).add(sc.nextInt());
            }
        }
        System.out.println(arr1);

    }
}
