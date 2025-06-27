package JAVA;

import java.util.Scanner;

public class squareroot {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter num:");
        int num = sc.nextInt();
        //Brute force
        //  int  sq = 0;
        // for(int i =1;i*i<=num;i++){
           
        //     sq=i;
        // }
        
        //         System.out.println("square root of "+num+" is "+sq);
// Time Complexity: O(√n)

       //Better approach
       //binary search
       int low =1, high =num,ans=0;

       while(low<=high)
       {
        int mid = low +(high-low)/2;
        if(mid<=num/mid){
        // mid * mid <= num is logically equivalent to:
        //Multiplying large mid * mid can cause integer overflow
            ans=mid;
            low=mid+1;
        }
        else{
            high=mid-1;
        }
       }
 
    System.out.println(ans);

    }
}
