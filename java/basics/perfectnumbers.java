package JAVA.basics;

public class perfectnumbers {
    public static void main(String[] args) {
        int num =11;
        int sum=0;
        if(num<=1) System.out.println("false");
        for(int i=1;i*i<num;i++){
            if(num%i==0){
                sum=sum+i;
            }
            if(i!=num/i){ // Avoid adding square root twice
                sum+=i;
            }
        }
        System.out.println(sum==num);
    }
}
