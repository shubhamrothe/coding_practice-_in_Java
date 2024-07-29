/*
 * 2. Best Time to Buy and Sell Stock
You are given an array of prices where prices[i] is the price of a
given stock on an ith day.
You want to maximize your profit by choosing a single day to buy
one stock and choosing a different day in the future to sell that
stock.
Return the maximum profit you can achieve from this transaction.
If you cannot achieve any profit, return 0
Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6),
profit = 6-1 = 5
 */

 //check it,not understood
package practice02.QuestionsOfDSA.Array;

public class MaxProfit 
    public static void main(String[] args) 
    {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int MaxProfit = maxProfit(prices);
        System.out.println("Maximum Profit: " + MaxProfit); // Output: 5
    }

    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length <= 1) {
            return 0;
        }

        int minPrice = prices[0];
        int MaxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else if (prices[i] - minPrice > MaxProfit) {
                MaxProfit = prices[i] - minPrice;
            }
        }

        return MaxProfit;
    }

    
}

