import java.util.Scanner;

public class occurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the numbe o ind occuenc:");
        int num = sc.nextInt();
        System.out.print("enter the digit");
        int n = sc.nextInt();
        sc.close();
        int count=0;
        while(num>0){
            int rem = num % 10;
            if (rem==n) {
                count++;
            }
            num =num/10;
        }
        System.out.println(count);
        
    }
}
