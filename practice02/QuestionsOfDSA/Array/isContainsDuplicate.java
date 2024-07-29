/*
 * 3. Contains Duplicate
Given an integer array nums, return true if any value appears at
least twice in the array, and return false if every element is
distinct.
Input: nums = [1,2,3,1]
Output: true
 */
package practice02.QuestionsOfDSA.Array;
import java.util.HashSet;

public class isContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        boolean hasDuplicate = containsDuplicate(nums);
        System.out.println(hasDuplicate); // Output: true
    }
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();

        for (int num : nums) {
            if (hs.contains(num)) {
                return true; // If we've seen this number before, return true
            }
            hs.add(num); // Add the number to the HashSet
        }

        return false; // No duplicate found, return false
    }
}

//time complexity=O(n)



// public class isContainsDuplicate 
// {
//     public static void main(String[] args)
//     {
//         int count=0;
//        int[] nums={1,2,2,1};
//        for(int i=0;i<nums.length;i++)
//        {
//         for(int j=i+1;j<nums.length;j++)
//         {
//             if(nums[i]==nums[j])
//               count++;
//         }
//        }
//        if(count==0)
//        System.out.print("false");
//        else
//        System.out.print("true");
//     }
    
// }


//time complexity=O(n^2)