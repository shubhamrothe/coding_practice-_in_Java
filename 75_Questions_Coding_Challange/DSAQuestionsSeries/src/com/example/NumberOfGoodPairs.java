package com.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * Number of Good Pairs
Given an array of integers nums, return the number of good pairs.
A pair (i, j) is called good if nums[i] == nums[j] and i < j
 */
public class NumberOfGoodPairs {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size array ");
		int n = sc.nextInt();
		int[] nums = new int[n];
		System.out.println("Enter the elements of array");
		for(int i=0;i<n;i++) {
			nums[i]=sc.nextInt();
		}
		
		int result = noOfGoodPairs(nums);
		System.out.println("No of Good Pairs = "+ result);
		
	}

	private static int noOfGoodPairs(int[] nums) {
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int count =0;
		for(int num : nums) {
			if(map.containsKey(num)) {
				count= count+map.get(num);
			map.put(num,map.get(num)+1);
			}else {
				map.put(num, 1);
			}
		}
		return count;
	}
}
