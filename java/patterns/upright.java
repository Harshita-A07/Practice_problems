package JAVA.patterns;

public class upright {
    
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<n;i++){//rpw
            for(int j=0;j<i;j++)
            {
                System.out.print(" ");//space
            }
            for(int k=n-i;k>0;k--)
            {
                System.out.print("*");
            }
        System.out.println(" ");
        }

    }
}
