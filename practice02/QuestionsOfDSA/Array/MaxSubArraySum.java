/* 5. Maximum Subarray
 * Given an integer array nums, find the subarray with the largest
sum, and return its sum.
Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6.
Input: nums = [1]
Output: 1
Explanation: The subarray [1] has the largest sum of 1.
 */
package practice02.QuestionsOfDSA.Array;

public class MaxSubArraySum {
    public static void main(String[] args)
    {
        int[] nums={-2,1,-3,4,-1,2,1,-5,4};
        //int[] nums={1};
        int output=findMaxSum(nums);
        System.out.print(" Max SubArrays sum= "+output);
    }
    public static int findMaxSum(int[] nums)
    {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int n=nums.length;
        int maxSum=nums[0];
        int currentSum=nums[0];
        for(int i=1;i<n;i++)//loop should start from 1
        {
            currentSum=Math.max(nums[i],currentSum+nums[i]);
            maxSum=Math.max(currentSum,maxSum);
        }
        return maxSum;
    }
    
}
