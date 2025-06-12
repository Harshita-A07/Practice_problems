import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class findprefix {
    
    public static void main(String[] args) {
        int [] a= {1,3,2,4};
        int [] b= {3,1,2,4};
       System.out.println(Arrays.toString(findprefix(a,b)));
    }
    public static int[] findprefix(int [] A,int[]B){
        Map<Integer,Integer> hA = new HashMap<>();
        Map<Integer,Integer> hB = new HashMap<>();
        int countpref =0;
        int n = A.length;
        int [] result = new int[n];
        for(int i=0;i<n;i++){
            int numA =A[i];
            int numB=B[i];

            hA.put(numA, hA.getOrDefault(numA,0)+1);
            hB.put(numB, hB.getOrDefault(numB,0)+1);
            //Checks if numA doesnt exists then 0  if present retreies its value and  adds 1 or else 0
            if(numA==numB){
                countpref+=1;;
            }
                else{
                    countpref+= hB.getOrDefault(numA,0 )+hA.getOrDefault(numB, 0); 
                   
                }
                result[i]=countpref;
            }
                 return result;

        }
    }

