package array_j;
import java.util.*;
public class twod {
   public static void main(String[] args) {
    int [][] arr = new int[3][3];
    System.out.println(arr.length);
    Scanner sc = new Scanner(System.in);
    System.out.println("enter he matrix");
   for(int row=0; row< arr.length;row++)
   {
    for(int col=0; col< arr[row].length;col++){
        arr[row][col] = sc.nextInt();

    }
   }
   System.out.println("PRINTED matrix");

//    for(int row=0; row< arr.length;row++){
//     for(int col=0; col< arr[row].length;col++){
//        System.out.print(arr[row][col]+"  " ) ;
//     } 
//     System.out.println();
//    }

//or we can print simply like this 

// for(int row=0; row< arr.length;row++){
//     System.out.println(Arrays.toString(arr[row]));
//or using enchanced forloop
      

// datatype of every single segment in the array  is an array
//      |-> inside array we have many arrays so the datatype  is array
  for(int [] num: arr){
    System.out.println(num);
  }
}
   } 

