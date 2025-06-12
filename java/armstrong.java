import java.util.*;

public class armstrong {
    public static void main(String[] args) {
        // Iterate over numbers from 1 to 56
        for (int i = 1053; i <= 1639; i++) { // Corrected the condition
            armstrong(i); // Call the method for each number
        }
    }

    public static void armstrong(int a) { // Make it static
        int original = a; // Save the original number
        int sum = 0;

        while (a > 0) {
            int rem = a % 10; // Extract the last digit
            int cube = rem * rem * rem*rem; // Calculate the cube of the digit
            sum += cube; // Add the cube of the digit to the sum
            a /= 10; // Remove the last digit
        }

        // Compare the sum of cubes to the original number
        if (original == sum) {
            System.out.println(original + " is an Armstrong number");
        } 
    }
}
