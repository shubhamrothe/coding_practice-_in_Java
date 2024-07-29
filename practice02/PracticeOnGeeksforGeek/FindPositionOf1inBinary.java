//find position of 1st "1" in binary representation of any number from right side

import static java.lang.System.out;
import java.util.*;

public class FindPositionOf1inBinary 
{
        public static int findPosition(int N) {
            if (N == 0) {
                return 0; // If N is 0, there are no set bits.
            }
    
            int position = 0; // Initialize the position to 1 (rightmost bit).
    
            // Iterate through the bits of N from right to left.
            /*while ((N & 1) == 0) {
                N >>= 1; // Right shift N to check the next bit.
                position++;
            }
    
            return position + 1;*/

            //optimise code for above
             return (int)(Math.log(N&-N)/Math.log(2.0)) + 1;
        }
    
        public static void main(String[] args) {
            int N = 4; // Example input
            int position = findPosition(N);
            System.out.println("Position of first set bit: " + position);
        } 
}
