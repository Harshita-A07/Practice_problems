package JAVA.zoho;

public class validparenRecursive {
    public static void main(String[] args) {
       String s = "))*))";
        boolean result = parenRecursive(s, 0, 0);
        System.out.println(result); 
    }
    public static boolean parenRecursive(String s, int index ,int count){
        //base case : if too many ')'
        if(count<0) return false;
        //if we have reached the end of the string this will return the final result only if count =0 it'll return true
        if(index == s.length()) return count==0;
      
         char c = s.charAt(index);
         if (c == '(') {
            return parenRecursive(s, index + 1, count + 1);
        } else if (c == ')') {
            return parenRecursive(s, index + 1, count - 1);
        } else {
            // c == '*'
            //  all 3 possibilities
            return parenRecursive(s, index + 1, count + 1)   // treat '*' as '('
                || parenRecursive(s, index + 1, count - 1)   // treat '*' as ')'
                || parenRecursive(s, index + 1, count);      // treat '*' as empty
        }
    }
}//TIME COMPLEXITY: worstcase there are 3 recursive branch (for *)
// O(3^K) k= no of *
//SPACE COMPLEXITY: O(K) stack depth due to recursion
