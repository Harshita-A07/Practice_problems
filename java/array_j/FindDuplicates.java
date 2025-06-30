package JAVA.array_j;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindDuplicates {
     public static List<Integer> findDuplicates(int[] arr) {

        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> duplicates = new ArrayList<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
            // putting the key num into the map, and updating its value by increasing its count by 1.
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            //Map.Entry<Integer, Integer> is the type of each element in the
            //map.entrySet() gives you a set of all key-value pairs in the map.
             if (entry.getValue() > 1) {
                duplicates.add(entry.getKey());
            }
        }
         return duplicates;
     }


     public static void main(String[] args) {
        int[] arr = {2, 3, 1, 2, 3};
        List<Integer> result = findDuplicates(arr);
        System.out.println(result);
     }
}
