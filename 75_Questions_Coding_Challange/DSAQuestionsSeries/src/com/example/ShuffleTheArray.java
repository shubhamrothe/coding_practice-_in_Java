package com.example;

import java.util.Scanner;

/*
 * Shuffle the Array
Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
Return the array in the form [x1,y1,x2,y2,...,xn,yn].
*/
public class ShuffleTheArray {

	public static void main(String[] args) {
		System.out.println("Enter the value of n (i.e. half of the length of array )");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums= new int[2*n];
		System.out.println("Enter "+2*n+" elements of array: ");
		for(int i=0;i<2*n;i++) {
			nums[i]=sc.nextInt();
		}
		
		sc.close();
		int[] result = suffleArray(nums,n);
		
		System.out.println("Suffled Array: ");
		for(int x:result) {
			System.out.println(x+ " ");
		}
	}

	private static int[] suffleArray(int[] nums, int n) {
		int[] result = new int[2*n];
		int index=0;
		for(int i=0;i<n;i++) {
			result[index++]=nums[i];
			result[index++]=nums[i+n];
		}
		return result;
		
	}
}
