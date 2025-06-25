package JAVA.patterns;


// A B C D 
// A B C
// A B
// A

public class pattern15{
    public static void main(String[] args) {
        int n=4;
        for(int i=1;i<=n;i++){
            for(char ch ='A' ; ch<'A'+(n-i+1);ch++){
                System.out.print(ch +" ");
            }
            System.out.println();
        }
    }
}
