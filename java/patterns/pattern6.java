package JAVA.patterns;

public class pattern6 {
    public static void main(String[] args) {
        int n=4;
        // int odd=1;
        // int even =2;
        int val=1;
        for(int i=1;i<=n;i++){
            
            for(int j=0;j<n;j++){
              
                
                System.out.print(val+"    ");
                val+=2;// when i=1 then  here val becomes 9 
            }  
            if(i%2==0){ 
                val-=1;
            }
            else{
                val-=(n+3);  //instead of 5 we can write n+3
            }
                
            System.out.println(" ");
        }
    }
}
