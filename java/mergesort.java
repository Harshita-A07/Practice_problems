import java.util.Arrays;

public class mergesort {
    public static void main(String[] args) {
        
        int [] arr={3,1,4,59,6,8,0};
        arr=mergesort(arr);
        System.out.println(Arrays.toString(arr ));
    }
    static int[] mergesort(int[] arr){

        if(arr.length==1){
            return arr;
        }
        int mid=  arr.length/2;
        int[] lef = mergesort(Arrays.copyOfRange(arr,0,mid));
        int [] right = mergesort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(lef,right);
    }
    static int[] merge(int[] left,int[] right)

{
    int [] mix = new int[left.length+right.length];

    int i=0;//first half
    int j=0;//seocnd half
    int k=0;// new merged(sorted array)
    while(i<left.length && j<right.length){
        if(left[i]<right[j]){
            mix[k]=left[i];
            i++;
        }
        else{
            mix[k]=right[j];
            j++;
        }
        k++;
    }
    //its possible that one array maybe loner that other
    // at these times copy the remaining elements in the array 
    // it can be array one or array tow
    while(i<right.length){
        mix[k]=right[i];
        i++;
        k++;
    }
    while(j<left.length){
        mix[k]=right[j];
        j++;
        k++;
    }
    return mix;
}
}
