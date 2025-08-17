package JAVA.recursion;

import java.util.ArrayList;

public class subsequence {

    public static void subsequence(int[] arr, int index, ArrayList<Integer> ans) {
        // Base case: if index == arr.length, print current subsequence
        if (index == arr.length) {
            System.out.println(ans);
            return;
        }

        // Choice 1: Include current element
        ans.add(arr[index]);
        subsequence(arr, index + 1, ans);

        // Backtrack: remove last element before next choice
        ans.remove(ans.size() - 1);

        // Choice 2: Exclude current element
        subsequence(arr, index + 1, ans);
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 2};
        ArrayList<Integer> ans = new ArrayList<>();
        subsequence(arr, 0, ans);
    }
}
