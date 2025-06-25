package JAVA.zoho;

public class longestSubstr {
    public static void main(String[] args) {
        String s = "abcabcbb";
        int maxLen = 0;
        int n = s.length();
   //BRUTE FORCE 
   // CHECK ALL THE POSSIBLE SUBSTRINGS
   // EX WHEN i=0 a  ab abc aba->false hence max so far will be 3 
   // EX WHEN i=1 b  b bc bca bcab->false hence max so far will be 3
   // EX WHEN i=2 c  c ca cab cabc->false hence max so far will be 3 
   // EX WHEN i=3 a  ab abc abcb->true hence max so far will be 3
   // EX WHEN i=4 b  bc bcb->true hence max so far will be 2
   // EX WHEN i=5 c  cb cbc->true hence max so far will be 2
        for (int i = 0; i < n; i++) {
            boolean[] hash = new boolean[256]; // Keeps track of characters seen

            for (int j = i; j < n; j++) {
                char c = s.charAt(j);
                if (hash[c]) {
                    break; // Duplicate found, break inner loop
                }
                hash[c] = true;          // Mark character as seen
                int len = j - i + 1;     // Length of current substring
                maxLen = Math.max(maxLen, len);  // Update max length
            }
        }
//time complexity-brute force
//O(n^2) 
//space complexity-brute force
//O(1)
        System.out.println("Longest length = " + maxLen);
    }
}
