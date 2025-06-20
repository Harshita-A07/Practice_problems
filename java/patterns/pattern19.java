package JAVA.patterns;
// Input: ‘N’ = 3
    
    // Output: 
    // *         *
    // * *     * *
    // * * * * * *
    // * *     * *
    // *         *  
public class pattern19 {
    public static void main(String[] args) {
        int n=3;
        int star =0;
        int breakpoint =n;
        int spaces = 2*n-2; 
        for(int i=1;i<=2*n-1;i++){
              if(i<=n)
                 star++;
              else
                 star--;
                
                for(int j=1;j<=star;j++){
                    System.out.print("* ");
                }
                for(int j=1;j<=spaces;j++){
                    System.out.print("  ");
                }
                for(int j=1;j<=star;j++){
                    System.out.print("* ");
                }
                System.out.println();
                if(i<n)
                {
                    spaces-=2;
                }
                else
                {
                    spaces+=2;
                }
        }
    }
}
