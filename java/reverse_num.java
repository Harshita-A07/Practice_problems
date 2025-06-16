package JAVA;

import java.util.Scanner;

public class reverse_num {
    public static void main(String[] args) {
        //6787  -> 7876
        Scanner sc = new Scanner(System.in);
        System.out.print("ene numbebr:");
        int num=sc.nextInt();
        int ans=0;
        while (num>0) {
            int last = num % 10;
            num=num/10;
            ans=ans*10+last; //0*7+7 = 7 , 7*10+8=78, 78*10+7=787     
        }
        System.out.println(ans);
        }
}
