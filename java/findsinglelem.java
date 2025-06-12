public class findsinglelem {
    public static void main(String[] args) {
        int [] arr ={1,1,2,3,3,4,4,8,8};
        System.out.println(singleelem(arr));
    }
    public static int singleelem(int[] arr){
        int start =0;
        int end = arr.length-1;
        while(start<end)
{
    int mid =(start+end)/2;
    if((mid % 2== 0 && arr[mid]==arr[mid+1])||(mid%2==1 && arr[mid]==arr[mid-1])){
        start=mid+1;
    }
    else{
       end=mid;
    }
}    

return arr[start];
//start and end will be in same place
}
}
