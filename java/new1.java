package JAVA;

import java.util.Scanner;

class new1{
    public static String getlexico(String s,int k){

        String small ="";
        String large ="";

        small = large= s.substring(0,k);
        for(int i=1;i<=s.length()-k;i++){
            String s1 = s.substring(i,i+k);
            if (s1.compareTo(small)<0) {
                small=s1;
                
            }
            if (s1.compareTo(large)>0) {
                large=s1;
                
            }

        }
        return small +"\n"+ large;

    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int k = sc.nextInt() ;  
        sc.close();
        System.out.println(getlexico(S, k));    
    }
}