import java.util.*;
import java.util.Scanner;
/*public class ifelse {
    public static void main(String[] args) {
        System.out.println("ifelse");
        
        char c ='p';
        if ( c == 'p'){
            System.out.println("yes");
        }
        else if (c == 'o') {
            System.out.println("no");
        }
        else{
            System.out.println("wrong");
            
        }
    }
}
*/


/* 
public class ifelse { 
    public static void main(String[] args) {
Scanner sc = new Scanner (System.in);
System.out.print("enter num :");
int num = sc.nextInt();
if(num%3 ==0 && num%5==0){
    System.out.println("yes");;
}
else{
    System.out.println("no di");
}
}
}
*/
// nested if 
public class ifelse{
    public static void main(String [] args)
{
    Scanner sc = new Scanner (System.in);
    System.out.print("enter total :");
    int tot = sc.nextInt();
    System.out.print("enter aptit mark");
    int n1 = sc.nextInt();
    if(tot>75){
        if(n1>60){
            System.out.println("eligible");
        }
        else if(n1>50) {
            System.out.println("small chance");


        }
        else{
            System.out.println("sorry ");
        }
    }


}}
