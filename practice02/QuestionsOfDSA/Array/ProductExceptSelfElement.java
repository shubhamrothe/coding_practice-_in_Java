/*
 * 4. Product of Array Except Self
Given an integer array nums, return an array answer such that
answer[i] is equal to the product of all the elements of nums
except nums[I].
The product of any prefix or suffix of nums is guaranteed to fit in a
32-bit integer.
You must write an algorithm that runs in O(n) time and without
using the division operation.
Input: nums = [1,2,3,4]
Output: [24,12,8,6]
 */
package practice02.QuestionsOfDSA.Array;

public class ProductExceptSelfElement {
    public static void main(String[] args)
    {
        int[] nums={1,2,3,4};
        int n = nums.length;
    // Initialize left and right product arrays with all elements as 1.
    int[] leftProducts = new int[n];
    int[] rightProducts = new int[n];
    
    // Compute the product of all elements to the left of each element.
    int leftProduct = 1;
    for (int i = 0; i < n; i++) {
        leftProducts[i] = leftProduct;
        leftProduct *= nums[i];
    }
    
    // Compute the product of all elements to the right of each element.
    int rightProduct = 1;
    for (int i = n - 1; i >= 0; i--) {
        rightProducts[i] = rightProduct;
        rightProduct *= nums[i];
    }
    
    // Calculate the final result by multiplying left and right products for each element.
    int[] result = new int[n];
    for (int i = 0; i < n; i++) {
        result[i] = leftProducts[i] * rightProducts[i];
    }
    
        for(int x:result)
        System.out.print(x+" ");
    }
}
