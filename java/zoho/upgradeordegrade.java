package JAVA.zoho;
import java.util.*;
public class upgradeordegrade {
   public static void main(String[] args) {
     Scanner obj = new Scanner(System.in);
        String v1 = obj.next();
        String v2 = obj.next();

        String[] v1Arr = v1.split("\\.");
        String[] v2Arr = v2.split("\\.");

        int len = Math.max(v1Arr.length, v2Arr.length);

        for (int i = 0; i < len; i++) {
            int num1 = i < v1Arr.length ? Integer.parseInt(v1Arr[i]) : 0;
            int num2 = i < v2Arr.length ? Integer.parseInt(v2Arr[i]) : 0;

            if (num1 > num2) {
                System.out.println("DownGrade");
                return;
            } else if (num1 < num2) {
                System.out.println("UpGrade");
                return;
            }
        }

        System.out.println("Same Version");
    }
}
