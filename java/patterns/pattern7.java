package JAVA.patterns;
import java.util.*;

// 1 1 1 1 1 
// 1 2 2 2 1 
// 1 2 3 2 1 
// 1 2 2 2 1 
// 1 1 1 1 1 
public class pattern7 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            int top=i;//usual index of row
            int bottom=(n-i+1);//reverse index of row

            int min1=Math.min(top,bottom);
            for(int j=1;j<=n;j++){
                int left=j;//usual index of column
                int right=(n-j+1);//reverse index of column
                int min2=Math.min(left,right);
                int min=Math.min(min1,min2);
                System.out.print(min+" ");
            }
            System.out.println("");
        }

    }
}
