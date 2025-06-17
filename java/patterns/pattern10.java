package JAVA.patterns;

// *
// **
// ***
// ****
// *****
// ****
// ***
// **
// *
public class pattern10 {
    public static void main(String[] args) {
        nStarTriangle(5);
    }
    public static void nStarTriangle(int n) {
        // Write your code here

         for(int i=1;i<2*n;i++){// since there are <2*n rows not n rows 
            int temp=i;

            if(i>n)
                temp=2*n-i;  // below nth row there are 2* n-i stars
            
            for(int j=1;j<=temp;j++){
                System.out.print("*");
            }
System.out.println();
         }
        }
    }
