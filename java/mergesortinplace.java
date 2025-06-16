package JAVA;


import java.util.Arrays;

public class mergesortinplace {
    public static void main(String[] args) {
        
        int [] arr={3,1,4,5,6,8,0};
        mergesort(arr,0,arr.length);
        System.out.println(Arrays.toString(arr ));
    }
    static void mergesort(int[] arr,int s,int e){

        if(e-s<=1){
            return ;
        }
        int mid= (s+e)/2;
        mergesort(arr,s,mid);
        mergesort(arr,mid,e);
        merge(arr,s,mid,e);
    }
    private static void merge(int[] arr,int s,int m,int e)

{
    int [] mix = new int[e-s];

    int i=s;//first half
    int j=m;//seocnd half
    int k=0;// new merged(sorted array)
    while(i<m && j<e){
        if(arr[i]<arr[j]){
            mix[k]=arr[i];
            i++;
        }
        else{
            mix[k]=arr[j];
            j++;
        }
        k++;
    }
    //its possible that one array maybe loner that other
    // at these times copy the remaining elements in the array 
    // it can be array one or array tow
    while(i<m){
        mix[k]=arr[i];
        i++;
        k++;
    }
    while(j<e){
        mix[k]=arr[j];
        j++;
        k++;
    }
    for(int l=0;l<mix.length;l++){
        arr[s+l] = mix[l];
    }
}
}
