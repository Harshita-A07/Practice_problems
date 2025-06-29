package JAVA.basics;

public class gcd {
    public static void main(String[] args) {
        int ans= gcdofnums(16,36);
        System.out.println(ans);
    }
    public  static int gcdofnums(int a , int b){
        if(b==0)
        {
            return a;
        }
        else{
            return gcdofnums(b,a%b);

        }
    }
    //If a and b are two integers (where a ≥ b), 
    //the GCD of a and b is the same as the GCD of b and a % b.
}
