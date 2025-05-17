package array_j;

import java.lang.annotation.Target;

public class nextGreatestLetter{
//start {
public static void main(String[] args) {
    char[] a11 = {'a','c','f','i','l','m'};
    char t='k';
   System.out.println(nextGreatestLetter(a11,t)); 
}
static char nextGreatestLetter(char[] letts, char target){
    int start = 0;
int end = letts.length-1;
// Return the smallest character in letters that is lexicographically greater than target. If such a character does not exist, return the first character in letters.

 
while(start<=end){
    int mid = start + (end - start) / 2;

    if (target>letts[mid]) {
        start=mid+1;
        
    }
    else  {
        end =mid-1;
        
    }
    
    //mid == target is not explicitly checked because the goal is not to find the target character itself but to find the next greatest letter.
    //If the target is already present in the array, the next letter (greater than the target) should be returned, not the target itself.
//     Target is the largest character or greater than the largest character:
// The binary search exits when start > end.
// The wraparound logic ensures the first character is returned:
// return letts[start % letts.length];

}

return letts[start % letts.length];

    //return ;
}

}
    

