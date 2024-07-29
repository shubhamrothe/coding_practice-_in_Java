/*
 * 1. Two Sum
Given an array of integer nums and an integer target, return
indices of the two numbers such that they add up to the target.
You may assume that each input would have exactly one solution,
and you may not use the same element twice.
You can return the answer in any order.
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1]
 */

package practice02.QuestionsOfDSA.Array;

public class TwoSum {
    public static void main(String[] args)
    {
        int[] nums={2,7,15,1};
        int target=18;
        int x=-1,y=-1;
        for(int i=0;i<nums.length-1;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if((nums[i]+nums[j])==target)
                {
                x=i;
                y=j;
                break;
                }
            }
        }
        if(x!=-1 && y!=-1)
        System.out.print("Indices of the two numbers are : " + x + ", "+y);
        else
    System.out.print("No two numbers found that add up to the target.");
    }

    
    
}
