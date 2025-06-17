package JAVA.patterns;
import java.util.*;

// 5 5 5 5 5  
// 5 4 4 4 5 
// 5 4 3 4 5 
// 5 4 4 4 5 
// 5 5 5 5 5  
public class pattern8 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            int top=i;//usual index of row
            int bottom=(n-i+1);//reverse index of row

            int min1=Math.max(top,bottom);
            for(int j=1;j<=n;j++){
                int left=j;//usual index of column
                int right=(n-j+1);//reverse index of column
                int min2=Math.max(left,right);
                int min=Math.max(min1,min2);
                System.out.print(min+" ");
            }
            System.out.println("");
        }

    }
}
