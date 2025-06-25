package JAVA.zoho;
import java.util.*;
public class BestTimeToBuy {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};   
        int min = prices[0];//buying : bcz buying must be minimized inorder to selll it for larger price so  that we can maximise the profit
        int profit =0;
        for(int i=1;i<prices.length;i++){
            //find the selling price
            int costprice = prices[i]-min;
            profit =Math.max(profit,costprice);
            min =Math.min(prices[i],min);
        }
        System.out.println(profit);
    }
} 
