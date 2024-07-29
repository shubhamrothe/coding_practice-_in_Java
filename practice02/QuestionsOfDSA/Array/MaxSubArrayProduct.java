/*
 * 6. Maximum Product Subarray
Given an integer array nums, find a subarray that has the largest
product, and return the product.
Input: nums = [2,3,-2,4]
Output: 6
Explanation: [2,3] has the largest product 6.
Input: nums = [-2,0,-1]
Output: 0
Explanation: The result cannot be 2, because [-2,-1] is not a
subarray.
 */

package practice02.QuestionsOfDSA.Array;

public class MaxSubArrayProduct {
    public static void main(String[] args)
    {
        int[] nums={2,3,-2,4};
        int output=findMaxProduct(nums);
        System.out.print("Max SubArrays Product= "+output);
    }
    public static int findMaxProduct(int[] nums)
    {
        int maxProduct=nums[0];
        int minProduct=nums[0];
        int result = nums[0];
        int n=nums.length;
        int i;
        for(i=0;i<n;i++)
        {// To handle negative numbers, swap maxProduct and minProduct
            if(nums[i]<0)
            {
            int temp=maxProduct;
            maxProduct=minProduct;
            minProduct=temp;}
        }
        // Update maxProduct and minProduct for the current element
        maxProduct = Math.max(nums[i], maxProduct * nums[i]);
        minProduct = Math.min(nums[i], minProduct * nums[i]);

        // Update the result with the maximum product
            result=Math.max(result, maxProduct);
        return result;
    }
    
}
