/*
 * 9. 3Sum
Given an integer array nums, return all the triplets [nums[i],
nums[j], nums[k]]
such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
Notice that the solution set must not contain duplicate triplets.
Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
Explanation:
nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
The distinct triplets are [-1,0,1] and [-1,-1,2].
 */
package practice02.QuestionsOfDSA.Array;
import java.util.*;
public class ThreeSum 
{
    public static void main(String[] args)
    {
        int[] nums={-1,0,1,2,-1,-4};
        ThreeSum ob=new ThreeSum();
        List<List<Integer>> result=ob.threeSum(nums);
        System.out.print(result);
    }
    public List<List<Integer>> threeSum(int[] nums)
    {
      List<List<Integer>> triplets=new ArrayList<>();
      Arrays.sort(nums);//{-4,-1,-1,0,1,2}

      for(int i=0;i<nums.length-2;i++)
      {
        if(i>0 && nums[i]==nums[i-1])
        {
                continue;
        }
        int left=i+1;
        int right=nums.length-1;
        while(left < right)
        {
            int sum=nums[i] + nums[left] + nums[right];
            if(sum==0)
            {
             triplets.add(Arrays.asList(nums[i],nums[left],nums[right]));
                while(left < right && nums[left]==nums[left+1])
                {
                   left++;
                }
                while(left < right && nums[left]==nums[right-1])
                {
                   right--;
                }
                left++;
                right--;
            }
            else if(sum<0)
            {  left++; }
            else 
               {  right--;}
        }
      }
      return triplets;
    }   
}
