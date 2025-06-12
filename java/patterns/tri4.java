package patterns;

public class tri4 {

    public static void main(String[] args) {
        int rows = 5;
        for (int i = 0; i < rows; i++) {
            // Print leading spaces
            for (int s = 0; s < rows - i - 1; s++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            // Move to next line
            System.out.println();
        }
    }
}

