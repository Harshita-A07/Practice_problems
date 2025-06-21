package JAVA.zoho;

import java.util.*;

public class romantointeger {

        public static int romanToInt(String s) {
        int total=0;
        int previous =0;
    
        for(int i=s.length()-1;i>=0;i--){
            int curr = value(s.charAt(i));
            total+=(curr>previous)? curr:-curr;
             previous = curr;
        }
       
        return total;
        }


    public static int value(char ch) {
        switch (ch) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return -1; // fallback for invalid input
        }
    }

        public static void main(String[] args) {

        String roman = "MCMXCIV";  // 1994
        System.out.println("Integer value of " + roman + " is: " + romanToInt(roman));
    }


}
