import java.util.*;

public class switchc {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double num1, num2, result = 0;
        char operator;

        // Input numbers
        System.out.println("Enter n1:");
        num1 = sc.nextDouble();
        System.out.println("Enter n2:");
        num2 = sc.nextDouble();

        // Input operator
        System.out.println("Enter operator (+, *, -, /):");
        operator = sc.next().charAt(0);

        // Perform operation based on operator
        switch (operator) {
            case '*':
                result = num1 * num2;
                System.out.println("Answer: " + result);
                break;
            case '+':
                result = num1 + num2;
                System.out.println("Answer: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Answer: " + result);
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Answer: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid operator!");
                break;
        }

        sc.close(); // Close the scanner
    }
    
}
