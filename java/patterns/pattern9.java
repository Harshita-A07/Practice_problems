package JAVA.patterns;

public class pattern9 {
    public static void main (String[] args){
        int n=3;
        for(int i=1;i<=n;i++){
            int start=i;
            for(int j=1;j<=i;j++){
                System.out.print(start+" ");
                start++;
            }
            System.out.println(" ");
        }
    }
}
