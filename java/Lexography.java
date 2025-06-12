//import java.util.*;

/* 
public class lexography {
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

        // Read input strings A and B
        String A = scanner.nextLine();
        String B = scanner.nextLine();

        // Compare lexicographically and print "Yes" or "No"
        if (A.compareTo(B) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
  }  
}
*/

/* 
// in a array of strings 

public class lexography {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of strings: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Input the strings into an array
        String[] strings = new String[n];
        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            strings[i] = scanner.nextLine();
        }

        // Find the string with the highest lexicographical order
        String highest = strings[0];
        for (int i = 1; i < n; i++) {
            if (strings[i].compareTo(highest) > 0) {
                highest = strings[i];
            }
        }
        // Print the result
        System.out.println("String with the highest lexicographical order: " + highest);
    }
}
*/

import java.util.Scanner;


class Lexography {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // Initialize smallest and largest with the first substring
        smallest = largest = s.substring(0, k);
        
        // Iterate through all possible substrings of length k
        for (int i = 1; i <= s.length() - k; i++) {
            String substring = s.substring(i, i + k);
            if (substring.compareTo(smallest) < 0)  
            {
                smallest = substring;
            }
            if (substring.compareTo(largest) > 0) //Positive Value (> 0):

            //If the first string is lexicographically greater than the second string 
            {
                largest = substring;
            }
        }
        
        return "smallest: "+ smallest + "\n" +"Largest: "+ largest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string");
        String s = sc.next();
        System.out.print("Enter the k");
        int k = sc.nextInt();
        System.out.println(getSmallestAndLargest(s, k));
    }
}
