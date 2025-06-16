package JAVA.array_j;
import java.util.*;
public class nonprimi_array {
    // basic array creation
    //PRIMITIVE DATATYPES
   
        public static void main(String[] args) {
            int[] num ;
            num = new int[5];
            Scanner sc = new Scanner(System.in);
             
            System.out.print("enter the array ");
            for(int i=0;i<num.length;i++){
             num[i]= sc.nextInt();
    
            }
            for(int i=0;i<num.length;i++){
                System.out.print(num[i]+" ");
            }
        
        }
    }
     

