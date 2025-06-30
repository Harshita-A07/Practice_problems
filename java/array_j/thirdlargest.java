package JAVA.array_j;

public class thirdlargest {
    public static void main(String[] args) {
        

        int arr[] ={2,3,4,54,67,81,21,33,45,60};
         int n = arr.length;
         int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
        if(n<3) System.out.println(-1);
        for(int num :arr){
            if(num>first){
                third=second;
                second=first;
                first=num;
            }
            else if(num>second){
                third=second;
                second=num;
            } else if(num>third){
                third =num;
            }

        }
        System.out.println(third);
    }
    
}
//time complexity
//O(N)
