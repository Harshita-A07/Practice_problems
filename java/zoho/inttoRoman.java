package JAVA.zoho;

public class inttoRoman {

    public static String intRoman(int num){
        int[]  values   =  {1000,900,500,400,100,90,50,40,10,9,   5,     4,   1};
        String[] symbols ={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        String roman ="";
        for(int i=0;i<values.length;i++){
            while(num>=values[i]){
                num-=values[i];
                roman=roman+symbols[i];
            }

        }

        return roman;
    }
    public static void main(String[] args) {

        System.out.println(intRoman(650));

    }
}
