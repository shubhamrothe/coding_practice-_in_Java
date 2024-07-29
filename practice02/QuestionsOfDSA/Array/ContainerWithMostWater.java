/*
                 10. Container With Most Water
 * You are given an integer array height of length n. There are n
vertical lines drawn such that the two endpoints of the ith line are
(i, 0) and (i, height[I]).
Find two lines that together with the x-axis form a container, such
that the container contains the most water.
Return the maximum amount of water a container can store.
Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by an array
[1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section)
the container can contain is 49.
 */

 //check it, not understood
package practice02.QuestionsOfDSA.Array;

public class ContainerWithMostWater 
    public static void main(String[] args) 
    {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int result = maxArea(height);
        System.out.println("Maximum amount of water that can be stored: " + result);
    }
    public static int maxArea(int[] height) 
    {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) 
        {
            int h1 = height[left];
            int h2 = height[right];
            int h = Math.min(h1, h2);
            int width = right - left;
            int area = h * width;
            maxArea = Math.max(maxArea, area);

            if (h1 < h2) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }
}
