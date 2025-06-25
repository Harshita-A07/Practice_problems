package JAVA.zoho;

import java.util.*;

public class longestSubstringoptimized {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String str = obj.next();  // Input string

        int[] lastSeen = new int[26];  // Only for lowercase 'a' to 'z'

        // Initially mark all characters as "not seen"
        for (int i = 0; i < 26; i++) {
            lastSeen[i] = -1;
        }

        int left = 0, right = 0, maxLength = 0;

        while (right < str.length()) {
            char ch = str.charAt(right);
            int index = ch - 'a';  // index of current char(present in substring) is stored in lastseen

            // If character was seen AND is still inside current window
            if (lastSeen[index] != -1 && lastSeen[index] >= left) {
                // Move the left pointer to 1 position after last seen
                left = lastSeen[index] + 1;
            }

            // Update last seen index of the character
            lastSeen[index] = right;

            // Calculate window size
            maxLength = Math.max(maxLength, right - left + 1);

            right++; // Move right pointer forward
        }

        System.out.println(maxLength);
    }
}

