/*
 * You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

Increment the large integer by one and return the resulting array of digits.

 

Example 1:

Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].

Example 2:

Input: digits = [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
Incrementing by one gives 4321 + 1 = 4322.
Thus, the result should be [4,3,2,2].

Example 3:

Input: digits = [9]
Output: [1,0]
Explanation: The array represents the integer 9.
Incrementing by one gives 9 + 1 = 10.
Thus, the result should be [1,0].
 */


package practice02.Array;
import static java.lang.System.out;
import java.util.*;

public class IncrementLargeInteger 
{
    public int[] plusOne(int[] digits) 
    {
        int n = digits.length;
        // Iterate from right to left
        for (int i = n - 1; i >= 0; i--) {
            // If the current digit is less than 9, simply increment it and return the result
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            } 
            // If the current digit is 9, set it to 0 and continue to the next (left) digit
            digits[i] = 0;
        } 
        // If we reach here, it means we have a carry for the leftmost digit
        // In this case, we need to add an extra digit (1) at the beginning
         int[] result = new int[n + 1];
         result[0] = 1; // Set the leftmost digit to 1
         return result;
    }
    public static void main(String[] args) 
    {
        IncrementLargeInteger incrementer = new IncrementLargeInteger();
        // Example 1
        int[] digits1 = {1,2,3};
        int[] result1 = incrementer.plusOne(digits1);
        System.out.println(Arrays.toString(result1)); // Output: [1, 2, 4]
    }
}
