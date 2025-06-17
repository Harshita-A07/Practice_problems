package JAVA.patterns;

// n=5

// ********* 
//  *******  
//   *****   
//    ***    
//     * 


import java.util.Scanner;
public class pattern12 {
    public static void main(String[] args) {
        
    
    for(int i=0;i<=5;i++)
        {
             for(int j=0;j<i;j++)
      
             {
                System.out.print(" ");
                
            }
            
            for(int k=0;k<2*5 -(2*i+1);k++)
      
            {
               System.out.print("*");
               
           }
            
           for(int l=0;l<=i;l++)
      
           {
              System.out.print(" ");
              
          }
           System.out.println();


    }
}
    
}

