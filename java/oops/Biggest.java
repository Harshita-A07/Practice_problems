package JAVA.oops;

 class Biggest {
    private int[] arr;
    //constructor to intialise
    public Biggest(int[] nums ){
        this.arr=nums;
    }
//method
    public void display()   
     {         
        if(arr==null){
          System.out.println("empty array");

        }
        int max=arr[0];
        for(int i=1;i<arr.length;i++){

            if(arr[i]>max){
                max=arr[i];
            }
            
        }
System.out.println(max);
    }
    public static void main(String[] args) {

        int [] arr={2,4,6,7};
        Biggest obj = new Biggest(arr);
        obj.display();


    }
}
