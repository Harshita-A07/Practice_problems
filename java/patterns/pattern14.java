package JAVA.patterns;


// A B C D 
// E F G
// H I
// J

public class pattern14 {
    public static void main(String[] args) {
        int n=3;
       // char c ='A';
        for(int i=1;i<=n;i++){
            for(char ch ='A' ; ch<'A'+(n-i+1);ch++){
                System.out.print(ch +" ");
            }
            System.out.println();
        }
    }
}
