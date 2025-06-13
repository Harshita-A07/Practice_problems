package java.array_j;

import java.util.*;

// public class practice {
    
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//                 int [] num = new int[5];
//                 System.out.println("enter array");
//         for(int i=0;i< num.length;i++){
//             num[i]= sc.nextInt();
//         }
//         for(int i=0;i <num.length;i++)
//         System.out.print(num[i]+" ");
//     }
// }


// public class practice {
//     public static void main(String[] args) {
//         int[][] arr = new int[3][];
//         Scanner sc = new Scanner(System.in);
//         //arr.length give no of rows 
//         for(int row=0; row< arr.length;row++)
//    {
//     for(int col=0; col< arr[row].length;col++){
//         arr[row][col] = sc.nextInt();

//     }
//    }
//     }
// }
// public class practice {
// public static void main(String[] args) {
    
//    Scanner sc = new  Scanner(System.in);
//     ArrayList<Integer> arr= new ArrayList<>(6);
//     System.out.print("enter array");
//     for(int i=0;i<7;i++){
//         arr.add(sc.nextInt());
//     }
//     System.out.println("the array");
//     for(int i=0;i<7;i++){
//         System.out.println(arr.get(i));
//     }
// }
//}

public class practice {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
       //initialise
       for(int i=0;i<3;i++){
        arr.add(new ArrayList<>());
       }
       // get input
       for(int i=0;i<3;i++){
        for(int j=0;j<2;j++){
            arr.get(i).add(sc.nextInt());
        }
        
       }
       System.out.println(arr);
    }
}