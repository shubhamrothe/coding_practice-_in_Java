/*
 * Given an integer array nums, return all the Duplets [nums[i],nums[j]]
such that i != j, and nums[i] + nums[j] == 0.
Notice that the solution set must not contain duplicate Duplets.
 */
package practice02.Array;
import java.util.*;

public class IsSumOfTwoElementsZero 
{
    public static void main(String[] args)
    {
        int[] nums={-1, 2, -2, 0, 1};
        IsSumOfTwoElementsZero ob=new IsSumOfTwoElementsZero();
        List<List<Integer>> result=ob.twoSum(nums);
        System.out.print(result);

    }
    public List<List<Integer>> twoSum(int[] nums)
    {
        List<List<Integer>> duplets=new ArrayList<>();
        Arrays.sort(nums);

       int left =0;
       int right=nums.length-1;
       while(left < right)
       {
         int sum=nums[left] + nums[right];
         if(sum==0)
         {
            duplets.add(Arrays.asList(nums[left],nums[right]));
            while(left < right && nums[left]==nums[left+1])
            {
                  left++;
            }
            while(left<right && nums[right]==nums[right-1])
            {
                right--;
            }
            left++;
            right--;
         }
         else if(sum<0)
         {
            left++;
         }
         else
         {
            right--;
         }
        }
      return duplets;
    }
    
}
