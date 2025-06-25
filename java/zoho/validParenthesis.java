package JAVA.zoho;
//interview -> first tell the recursive way then show this
//linear method
public class validParenthesis {
    public static void main(String[] args) {
        String s ="*))";
        
        int min=0;
        int max=0;
        for(int i=0;i<s.length();i++)
        {

            char c = s.charAt(i);
            if(c =='('){
            min+=1;
            max+=1;
            }
            else if(c == ')'){
                min-=1;
                max-=1;
            }
            else{
                // when c='*'
                min-=1;//Bestcase:ex "(*", then the * could be ")" → "()" → valid.
                max+=1;//worst case, the * could act as '(', which adds an open bracket.
            }
            // after modifying value sof min nd max
            // check
            if(min<0){ //checking mi =n here bcz max is a positive value

                min=0;
            }
            //manage dge case where ex str='))' (starts with ) hence both min maxm -> -1
            if(max<0){ // this measn the str has too many closing brackets so its definitely invalid
                System.out.println("false");
                return;
            }
        }  
        System.out.println(min==0);
}
    
}
// TIME COMPLEXITY -> O(N)
//SPACE COMPLEXITY -> O(1)

