package JAVA.array_j;

public class secondlargest {
    public static void main(String[] args) {
        int arr[] ={2,1,3,4,6,7,9,8};
        int max =arr[0];
        // if array contains -ve numbers consider v ad INT_MIN 
        int secondlargest=-1;
    //better than brute force
        // for(int i=1;i<arr.length;i++){
        //     if(arr[i]>max){
        //         max=arr[i];
        //     }
        // }
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]>secondlargest && arr[i]<max){
        //         secondlargest=arr[i];
        //     }
        // }
        // System.out.println(secondlargest);
//time complexity
// for finding max -> O(n)
//for finding 2ndlargest -> O(n)
// total time complexity -> O(2n)

    //optimized
    for(int i=1;i<arr.length;i++){
        if(arr[i]>max){
            secondlargest=max;
            max=arr[i];
        }
        else if(arr[i]<max && arr[i]>secondlargest){
            secondlargest=arr[i];

        }
            
        }
        System.out.println(secondlargest);
    }
    
    }
    //time complexity
    //0(N)


