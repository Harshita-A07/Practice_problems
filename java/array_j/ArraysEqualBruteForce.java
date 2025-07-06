package JAVA.array_j;

import java.util.*; 

public class ArraysEqualBruteForce {
    public static boolean areEqual(int[] a, int[] b) {
        if (a.length != b.length) return false;

        boolean[] visited = new boolean[a.length];

        for (int i = 0; i < a.length; i++) {
            int countA = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j]) {
                    countA++;
                }
            }

            int countB = 0;
            for (int j = 0; j < b.length; j++) {
                if (!visited[j] && a[i] == b[j]) {
                    countB++;
                     visited[j] = true; //isited[j]=true after counting a match. 
                }
            }

            if (countA != countB) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 5, 4, 0};
        int[] b = {2, 4, 5, 0, 1};

        System.out.println(areEqual(a, b)); // true

        int[] c = {1, 2, 5};
        int[] d = {2, 4, 15};

        System.out.println(areEqual(c, d)); // false
    }
}
