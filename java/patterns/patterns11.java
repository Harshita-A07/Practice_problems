package JAVA.patterns;

// 1  
// 2 3
// 4 5 6
// 7 8
// 9


public class patterns11 {
    public static void main(String[] args){
                triangle(5);
    }
    public static void triangle(int n){
         int num=1;
        for(int i=1;i<=n;i++){
            int temp;
            if(i<n/2 +1){
                temp=i;
            }
            else{
                 temp=n-i+1;
            }    
            for(int j=1;j<=temp;j++){
                System.out.print(num++ + " ");
               // num++;
            }
            
            System.out.println(" ");
        }
        
    }
}
