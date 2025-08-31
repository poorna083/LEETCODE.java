/*You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

 

Example 1:

Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
Example 2:

Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transactions are done and the max profit = 0. */

import java.util.Scanner;
class Solution {
    private int res;
    public int maxProfit(int[] prices) {
        int pres = 0;
        for(int i=0;i<prices.length;i++){
            if (prices[i]<prices[i+1]) {
                pres = prices[i+1];
                res = prices[i+1];
                if(prices[i+1]<prices[i+2]){
                    pres = prices[i+1];
                    res = prices[i+1];
                }
            }
            else if(prices[i]>prices[i+1]){
                res = 0;
            }
        }return res;
    }
}



public class stockBuyAndSell {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] prices = new int[size];
        for(int i=0;i<size;i++){
            prices[i]=sc.nextInt();
        }
        Solution s = new Solution();
        System.out.println(s.maxProfit(prices));
    }
}
