package JAVA.basics;

import java.util.Scanner;

public class palindromnumbers {
 public static void main(String[] args) {
    Scanner sc =  new Scanner(System.in);
    int num = sc.nextInt();
    int org =num;
    int rev=0;
    while(num!=0){
       int last = num%10;
        rev = rev*10+last;
        num=num/10;
    }
  if(org==rev){
    System.out.println("palindrome");
  }
  else{
    System.out.println("not");
  }
 }   
}
