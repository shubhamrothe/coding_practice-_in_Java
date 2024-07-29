/*
 * Given two numbers A and B. Find the value of pair (P,Q) such that A <= P < Q <= B value of P AND Q is maximum where AND is a binary operator.

1) Sample Input 2 3 Sample Output 2

2) Sample Input 4 8 Sample Output 6
 */

package practice02.Array;

public class MaxBitwiseAND {
    public int maxAndValue(int A, int B) {
        int result = 0;
        int mask = 1 << 30;  // Start with the MSB

        while (mask > 0) {
            int P = A | mask;  // Set the current bit to 1 for P
            int Q = B | mask;  // Set the current bit to 1 for Q

            if (P <= B && Q <= B) {
                result |= mask;  // Set the bit in the result
            }

            mask >>= 1;  // Move to the next bit
        }

        return result;
    }

    public static void main(String[] args) {
        MaxBitwiseAND maxAnd = new MaxBitwiseAND();
        
        // Example 1
        int A1 = 2;
        int B1 = 3;
        int result1 = maxAnd.maxAndValue(A1, B1);
        System.out.println("Example 1: " + result1); // Output: 2
        
        // Example 2
        int A2 = 4;
        int B2 = 8;
        int result2 = maxAnd.maxAndValue(A2, B2);
        System.out.println("Example 2: " + result2); // Output: 6
    }
}
