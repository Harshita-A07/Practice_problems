package JAVA;
import java.util.*;
public class minMaxDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nums = sc.nextInt();
        //int nums = 9890999;
        System.out.println(minMaxDifference(nums));
    }
    public static int minMaxDifference(int num) {
        
        String s = Integer.toString(num);
        String t =s;
        int pos =0; // to move pointer so that we can track whether it's a 9 or not
        while(pos<s.length() && s.charAt(pos)=='9'){
            pos++; //increment the position if it's a 9 
        }
        // when its a non 9 we'll replace it with 9
        if(pos<s.length()){
            s=s.replace(s.charAt(pos),'9');// replace the first(left to right) non 9 with 9 to amke it the largest

        }
        //next to make the smallest number changing the first digit to 0
       t= t.replace(t.charAt(0),'0');
       return Integer.parseInt(s) - Integer.parseInt(t);
        }
      
    }

