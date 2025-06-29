package JAVA.basics;

import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num  = sc.nextInt();
        int org=num;
        int sum=0;
        while(num!=0){
            int rem = num%10;
            int res = (int) Math.pow(rem,3);
            sum=sum+res;
            num=num/10;
        }
        if(sum==org){
            System.out.println(org +" is armstrong");
        }
        else{
            System.out.println("not");
        }
        
    }
}
