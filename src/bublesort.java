import java.util.Arrays;

public class bublesort {
    
    public static void main(String[] args) {
        int[] arr={2,4,1,5,3};
        buble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void buble(int arr[]){
        int n = arr.length;
        for(int i=0;i<n;i++){
            //for each step max index will come at the last of the last respective index
            for(int j=1;j<n-i;j++){
                if(arr[j]<arr[j-1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;

                }
            }
        }
        

    }
}
