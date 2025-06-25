package JAVA.array_j;


public class maxelement {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int max = arr[0];
        for(int i=1;i<=arr.length-1;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
