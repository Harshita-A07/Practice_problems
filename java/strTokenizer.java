package JAVA;

import java.io.StreamTokenizer;
//
import java.util.*;
public class strTokenizer {
    
    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a sentence");
        String st = sc.nextLine();
        StringTokenizer stk = new StringTokenizer(st," !-]',._?");
        System.out.println(stk.countTokens());
        while(stk.hasMoreTokens())
        {
            System.out.println(stk.nextToken());
        }
        }
}
