package java;

import java.util.Scanner;

public class prime {
    public static boolean isPrime(int n) {
        // A prime number must be greater than 1
        if (n <= 1) return false;
         int i=2;
        // Check divisors up to the square root of n
        while(i * i <= n)  {
            if (n % i == 0) {
                return false; // Not a prime number
            }
        }
        i++;

        return true; // Prime number
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it's prime: ");
        int num = sc.nextInt();

        if (isPrime(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}
