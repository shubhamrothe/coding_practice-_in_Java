/*
 * 7. Find the Minimum in Rotated
Sorted Array
Given the sorted rotated array nums of unique elements, return
the minimum element of this array.
You must write an algorithm that runs in O(log n) time.
Input: nums = [3,4,5,1,2]
Output: 1
Explanation: The original array was [1,2,3,4,5] rotated 3 times.
 */
package practice02.QuestionsOfDSA.Array;

public class findMininRotetedSortedArray {
    public static void main(String[] args)
    {
        int[] nums={3,4,5,1,2};
        int result = findMin(nums);
        System.out.println("Minimum Element: " + result);
    }
    public static int findMin(int[] nums) 
    {
        int left=0;
        int right=nums.length-1;
        while(left<right)
        {
            int mid=left+(right-left)/2;
            if(nums[mid]>nums[right])
            {
                // The minimum is in the right half
                left = mid + 1;
            }
            else{
                //The minimum is in the left half
                right=mid;
            }
        }
        return nums[left];
    }
}
