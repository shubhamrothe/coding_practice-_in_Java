package com.example;

import java.util.Scanner;

/*Concatenation of Array
Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i]
and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).Specifically, ans is the concatenation of two nums arrays.
Return the array ans.
*/
public class ConcatinationOfArray {

	public static void main(String[] args) {

		//
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of array : ");
		int n=sc.nextInt();
		Integer[] nums = new Integer[n];
		System.out.println("Take "+ n+" elements of array :");
		for(int i=0;i<n;i++) {
			nums[i] =sc.nextInt();
		}
		sc.close();
		Integer[] ans = new Integer[2*nums.length];
		for(int i=0;i<n;i++) {
			ans[i]=nums[i];
			ans[i+n]=nums[i];
		}
		
//		Integer[] ans = Arrays.copyOf(nums, 2*nums.length);
//		for(int i=0;i<n;i++) {
//			//ans[i]=nums[i];
//		ans[i+n]=nums[i];
//	}
		
		
	for(Integer a: ans) {
		System.out.print(a+ " ");
		}
	}
}
