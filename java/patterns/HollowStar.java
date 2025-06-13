package java.patterns;

import java.util.Scanner;

public class HollowStar {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        if (n % 2 == 0) {
            System.out.println("Enter only odd number");
            return;
        }

        int outside_space = n / 2;
        int inside_space = 1;

        for (int i = 0; i < n; i++) {
            // Print outside spaces
            for (int j = 0; j < outside_space; j++)
                System.out.print(" ");

            // First and last line only one star
            if (i == 0 || i == n - 1) {
                System.out.println("*");
            } else {
                // Print first star
                System.out.print("*");

                // Print inside space
                for (int j = 0; j < inside_space; j++)
                    System.out.print(" ");

                // Print second star
                System.out.println("*");
            }

            // Update spaces
            if (i < n / 2) {
                outside_space--;
                inside_space += 2;
            } else {
                outside_space++;
                inside_space -= 2;
            }
        }
    }
}
