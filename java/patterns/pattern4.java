package JAVA.patterns;

import java.util.Scanner;

//n=3
// 1 4 7 
// 2 5 8
// 3 6 9
public class pattern4 {
    
    public static void main(String[] args) {
        
        // for (int row = 1; row <= n; row++) {
        //     int num = row;
        //     for (int i = 1; i <= n; i++) {
        //         System.out.print(num + " ");
        //         num += n;
        //     }
        //     System.out.println();
        // }
        //WITHOUT USING VARIABLE 
        System.out.print("enter n:");
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=0; j<n; j++){
                System.out.print((i+(n*j))+" ");
            }
            System.out.println();
        }
        obj.close();
        }
}

    



