package JAVA.patterns;
//n=3
// A 
// B B
// C C C

//alphaRamp
public class pattern16{
    public static void main(String[] args){
  int n=3;
    for(int i=0;i<n;i++){

        char ch =(char)('A'+i);// bcz for each i(row) we need next alphabet

        for(int j=0;j<=i;j++){
            System.out.print(ch +" ");
           
        }
        System.out.println( );
    }

}
}
