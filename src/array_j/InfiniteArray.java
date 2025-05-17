package array_j;

public class InfiniteArray {
    public static void main(String[] args) {
        int [] arr ={1,2,3,4,5,6,66,7,78,8};
        int target =7;
        System.out.println("the index:");
        System.out.print(ans(arr,target));
    }
    static int ans(int[] arr, int target){
        int nstart=0;
        int nend=1;

        while(nend<arr.length && target>arr[nend]){
            System.out.println("nstart: " + nstart + ", nend: " + nend);

            int temp = nend +1;
            nend = nstart +(nend - nstart+1)*2;
            //Math.min(arr.length - 1, nend + (nend - nstart + 1) * 2);
            nstart =temp;
            if (nend >= arr.length) {
                nend = arr.length - 1;
                break;
            }

        }
        return binarysearch(arr,target,nstart,nend);
    }
    static int binarysearch(int[] arr, int target,int start,int end ){
        while(start<=end) {
            int mid = start + (end-start)/2;
             if(target<arr[mid]){
                end = mid-1;
             }
             else if(target>arr[mid]){
                start = mid+1;
             }
             else {
                return mid;
             }
          
        }
        return -1;

    }
}
