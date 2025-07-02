package JAVA.array_j;

import java.util.HashMap;
import java.util.Map;

public class ArraysEqualOptimized {
    public static boolean areEqual(int[] a, int[] b) {
        
    
   HashMap<Integer,Integer> feqa = new HashMap<>(); 
    HashMap<Integer,Integer> feqb = new HashMap<>(); 

    for(int num: a){
        feqa.put(num,feqa.getOrDefault(num,0)+1);
    }
    for(int nums :b){
        feqb.put(nums,feqb.getOrDefault(nums,0)+1);

    }
    return feqa.equals(feqb);
}
    public static void main(String[] args) {

        int[] a = {1, 2, 5, 3, 0};
        int[] b = {2, 4, 5, 0, 1};

        System.out.println(areEqual(a, b)); // true
        
    }
}



