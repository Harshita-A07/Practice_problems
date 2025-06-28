package JAVA.basics;

public class divisors {
    public static void main(String[] args) {
        int num =36;
        System.out.println("divisors of "+num +":");
        // for(int i=1;i<=num;i++){
        //     if(num%i==0){
        //         System.out.print(i+" ");
        //     }
        // }
        //TIME COMPLEXITY -> O(n)
    //optimized version 
    int[] small = new int[100];
    int[] large = new int[100];
    int sIndex=0,lIndex=0;
        for(int i=1;i*i<=num;i++){
            if(num%i==0){
                small[sIndex++]=i;
                if(i!=num/i){// another pair of divisor
                    large[lIndex++]=num/i;;
                }   
                // if 2 is divisor of 36 then 2^2(4) is also a divisor
            }
        }
        for (int i = 0; i < sIndex; i++) {
            System.out.print(small[i] + " ");
        }

        // Print large divisors in reverse
        for (int i = lIndex - 1; i >= 0; i--) {
            System.out.print(large[i] + " ");
        }
        //Time complexity -> O(√n)+O(√n)=O(√n)
    }
}
