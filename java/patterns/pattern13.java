package JAVA.patterns;


// A 
// A B 
// A B C 
public class pattern13 {
    
    public static void main (String[] args){
        int n=3;
        for(int i=1;i<=n;i++){
            char s ='A';
            for(int j=1;j<=i;j++){
                System.out.print(s+" ");
                s++;
            }
            System.out.println();
        }
    }
}
