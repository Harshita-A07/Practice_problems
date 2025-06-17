package JAVA.patterns;

// 1 
// 2 3 
// 4 5 6 

public class pattern9 {
    public static void main (String[] args){
        int n = 3;
        int num = 1;  // local variable
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(num++ + " ");
            }
            System.out.println();
        }
    }
}
