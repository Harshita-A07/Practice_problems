package JAVA;
import java.util.*;
    class maximunDifference{
        public static void main(String[] args)
{
    int arr[] ={7,1,5,4};
    System.out.println(maxDiff(arr));
}  

public static int maxDiff(int [] nums){
    //condition : i<j and nums[i]<nums[j] then find max diff of nums[j]-nums[i]
    int i = nums[0];
    int maxdiff =-1;
    for(int j=1;j<nums.length;j++){

        if(nums[j]>i){
 maxdiff =Math.max(maxdiff,nums[j]-i);
        }
       
    
    else{
        i=nums[j];
    }
    }
    return maxdiff;
}

}
