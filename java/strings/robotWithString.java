package java.strings;
import java.util.*;
public class robotWithString {
   
       public  static String robotWithString(String s) {
           
        int[] cnt = new int[26];//count of each character a-z
        for(char c: s.toCharArray()){
            cnt[c - 'a']++; // adding count of each character in cnt array
        }
          Stack<Character> stack = new Stack<>();//1st operation: to append first character to stack (string t)
          StringBuilder res = new StringBuilder();//2nd operation: to remove last char of string t and write on paper
          char minCharacter = 'a'; //current minimun character
          for(char c:s.toCharArray()){
            stack.push(c);//1st operation
            cnt[c -'a']--; // decreasing the count of that character in the cnt list

            while(minCharacter !='z' && cnt[minCharacter - 'a'] ==0)
            //checking if the minCharacter is not 'z' and if the count of that minCharacter is 0 .
            {
                minCharacter++;//increasing the minCharacter eg: from a to b
                //if there is no such minCharacter in the cnt then we have to move toa new minCharacter so that we can compare 
                //bcz we want to know the smallest character that still has not appeared in the string/stack

          }
          while(!stack.isEmpty() && stack.peek()<=minCharacter){
            res.append(stack.pop());
            //when stack is not empty and top element of stack is <= minCharacter append it to the main result
          }

        
       }


return res.toString();

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object

        System.out.print("Enter a string: ");
        String input = scanner.nextLine(); // Read user input

        String result = robotWithString(input);
        System.out.println("Result: " + result);

        scanner.close();
    }
}

