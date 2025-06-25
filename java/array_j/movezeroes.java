package JAVA.array_j;

import java.util.ArrayList;

public class movezeroes {
    public static void main(String[] args) {
        

        int arr[] ={2,3,0,3,9,6,0,9,0,4,3,0,1};
        ArrayList<Integer> list = new ArrayList<>();
        //when we are not sure of the size of the array we use arraylist
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                list.add(arr[i]);
            }
            
        }
        int size =list.size();
            for(int i=0;i<size;i++){
                arr[i]=list.get(i);
            }
            for(int i=size;i<arr.length;i++){
                arr[i]=0;
            }
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" " );
            }
    }
}

