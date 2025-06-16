package JAVA.array_j;


import java.util.*;

//normal


// public class primitive_array {
//     public static void main(String[] args) {
//         // Declare an array to store strings
//         String[] arr = new String[5];
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter 5 strings:");
//         // Input 5 strings into the array
//         for (int i = 0; i < arr.length; i++) {
//             arr[i] = sc.next(); // Read each string
//         }

//         System.out.println("Output:");
//         // Output each string directly
//         for (String str : arr) {
//             System.out.println(str); // Print each string individually
//         }

//         sc.close(); // Close the scanner to prevent resource leaks
//     }
// }




  // extra 

public class primitive_array {
    //same thing but using strings 
public static void main(String[] args) {


    String[] arr = new String[5];
    Scanner sc = new Scanner(System.in);
    

    for(int i=0; i<arr.length;i++)
    {
        arr[i]=sc.next();
    }
    
      String  arr1=Arrays.toString(arr); 
    StringTokenizer st = new StringTokenizer(arr1," ,");
    while(st.hasMoreTokens()){
        System.out.println(st.nextToken());
    }

}
}

