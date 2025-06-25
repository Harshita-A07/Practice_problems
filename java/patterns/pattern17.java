package JAVA.patterns;

//n=3
//   A
//  ABA
// ABCBA

public class pattern17 {
   
        
    // Sample main to run it
    public static void main(String[] args) {
     int n=3;
     
     for(int i=1;i<=n;i++){
       
        //space
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
            
        } char ch ='A';
        int breakpoint =i;
        
        //alphabet 1,3,5
        for(int j=1;j<=2*i-1;j++){
            System.out.print(ch );
            if(j<breakpoint){
                ch++;
            }
            //right half where j=4,5
            else{
                ch--;
            }
        }
        System.out.println();
     }
    }
}
