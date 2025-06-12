package array_j;

public class linear_search {
    public static void main(String[] args) {
       // int[] a1 ={1,12,3,33};
        // for(int index=0;index<a1.length;index++){
        //     if (a1.length==0) {
                
        //         System.out.println("empy");
        //     }
        //     if (a1[index]== 3) {
        //         System.out.println("ywa");
        //         System.out.println(index+1);
        //     }
        int[] a1 ={12,36,7,8,99};
        // for (int i : a1) {
        //     if (i==3) {
        //         System.out.println(i);
                
        //     }
        // }  
        //linearsea(a1,2,6);
        System.out.println(min(a1));

        }

        //linear_search within a range
        // static int linearsea(int[] ar,int start,int end){
        //     if (ar.length==0) {
        //         return -1;
                
        //     }
        //     for(int i=start;i<=end;i++){
        //     if (ar[i]==3) {
        //         return i;
                
        //     }
        //     }
        //                 return end;

         
        static int min(int[] ar)
        {
            if (ar.length==0) {
                    return -1;            
        }
        int min= ar[0];
        for(int i=1;i<ar.length;i++){
                if (min>ar[i]) 
                {
                    min=ar[i];
                    
                }
            }
                    return min;
        
    }
}


