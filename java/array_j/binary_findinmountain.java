package array_j;


//Both implementations have the same theoretical time complexity, but practical runtime may vary due to differences in coding style and method calls

// LEETCODE SOLUTION
/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
//  class Solution {
//     public int findInMountainArray(int target, MountainArray mountainArr) {
//         int n = mountainArr.length();
//         int peak = findPeak(mountainArr, n);
//         int res = findTarget(mountainArr, 0, peak, target, true);
//         if(res != -1){
//             return res;
//         }
//         return findTarget(mountainArr, peak+1, n-1, target, false);
//     }

//     private int findTarget(MountainArray mountainArr, int left, int right, int target, boolean isUpside){
//         while(left <= right){
//             int mid =  left+(right-left)/2;
//             int midVal = mountainArr.get(mid);

//             if(midVal == target){
//                 return mid;
//             }
//             if(isUpside){
//                 if(midVal > target){
//                     right = mid - 1;
//                 } else{
//                     left = mid + 1;
//                 }
//             } else{
//                 if(midVal > target){
//                     left = mid + 1;
//                 } else{
//                     right = mid - 1;
//                 }
//             }
//         }
//     return -1;
//     }
//     private int findPeak(MountainArray mountainArr, int length){
//         int left = 0;
//         int right = length-1;
//         while(left < right){
//             int mid = left+(right-left)/2;
//             if(mountainArr.get(mid) < mountainArr.get(mid+1)){
//                 left = mid + 1;
//             } else{
//                 right = mid;
//             }
//         }
//     return left;
//     }
// }


 /// KUNAL
/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
// class Solution {
//     public int findInMountainArray(int target, MountainArray mountainArr) {     
//         int peak = mountainpeak(mountainArr);
//         //checking first half
//         int index = oderagnostic(mountainArr,target,0,peak);
//         if(index !=-1){
//             return index;
//         }
//         return oderagnostic(mountainArr, target, peak+1, mountainArr.length() - 1);
       
//     }
//     public int mountainpeak(MountainArray arr){
// //we dont know target we are gonna find peak using mid
//     int start= 0;
//        int end=arr.length()-1;

//        while(start<end){
//         int mid = start +(end -start)/2;
//         if(arr.get(mid)<arr.get(mid+1)){
//             start =mid+1;
//         }
//         else{
//             end =mid;
//         }
//        }
//        return start;
//     }
//     public int oderagnostic(MountainArray arr, int target,int start,int end){
        
//         boolean isAsc = arr.get(start) < arr.get(end);
//         while(start<=end){
//             int mid = start =(end-start)/2;
//             if(target==arr.get(mid)){
//                 return mid;
//             }
//             else{
//                 if(isAsc){
//                     if(target<arr.get(mid)){
//                         end = mid-1;
//                     }
//                     else{
//                         start=mid+1;
//                     }
//                 }
//                 else{
//                     if(target<arr.get(mid)){
//                         start=mid+1;
//                     }
//                     else{
//                         end =mid-1;
//                     }
//                 }
//             }
//         }
//         return -1;
//     }
// }


