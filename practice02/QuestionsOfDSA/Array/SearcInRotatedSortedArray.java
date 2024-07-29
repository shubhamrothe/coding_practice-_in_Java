/*
 * 8. Search in Rotated Sorted Array
Given the array nums after the possible rotation and an integer
target, return the index of the target if it is in nums, or -1 if it is not
in nums.
You must write an algorithm with O(log n) runtime complexity.
Input: nums = [4,5,6,7,0,1,2], target = 0
Output: 4
Input: nums = [4,5,6,7,0,1,2], target = 3
Output: -1
*/
package practice02.QuestionsOfDSA.Array;

public class SearcInRotatedSortedArray 
{
    public static void main(String[] args)
    {
        int[] nums = {4,5,6,7,0,1,2};
        int  target = 0;
        int result= searchElement( nums, target);
        System.out.print("The element is found at index : "+result);
    }
    public static int searchElement(int[] nums, int target)
    {
        int n=nums.length;
        int left=0;
        int right=n-1;
        while(left<=right)
        {
            int mid=left +(right-left)/2;
            if(nums[mid]==target)
            {
                return mid;
            }
            if(nums[left]<=nums[mid])
            {
                if(nums[left]<=target && target<nums[mid])
                {
                    right=mid-1;
                }
                else{
                    left=mid+1;
                }
            }
            else
            {
                if(nums[mid]<target && target<=nums[right])
                {
                    left=mid+1;
                }
                else{
                    right=mid-1;
                }
            }
        }
        return -1;
    } 
}
