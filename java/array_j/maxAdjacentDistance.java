package java.array_j;

import java.util.*;

public class maxAdjacentDistance {

    public static int maxAdjacentDistance(int[] nums) {
        
int size = nums.length;
int maxdiff=0;
        for (int i = 0; i < size; i++) {
            int index = (i+1) % size;
            int diff =Math.abs(nums[i] - nums[index]);
            maxdiff = Math.max(maxdiff,diff);
        }
return maxdiff;
    }
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int result = maxAdjacentDistance(nums);
        System.out.println("Maximum adjacent distance: " + result);
    }
}
