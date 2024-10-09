package com.example;

import java.util.Scanner;

/*
 * Description: Write a program to check if a number is an Armstrong number.  
   Example:  
   Input: number = 153  
   Output: Armstrong Number
   Explanation: 153 is an Armstrong number because 1^3 + 5^3 + 3^3 = 153.  */
public class Question04 {

	public static boolean checkArmstrongOrNot(int number, int count) {
		int sum=0;
		int originalNumber=number;
		while(number>0) {
			int digit=number%10;
			sum=(int) (sum+Math.pow(digit,count));
			number /=10;
		}
			return sum==originalNumber;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = scanner.nextInt();
		int count=0;
		int n=number;
		while(n>0) {
			n=n/10;
			count++;
		}
		
		boolean armstrongOrNot = checkArmstrongOrNot(number,count);
		String output = armstrongOrNot? number +" is a ArmStrong Number" : number +" is not a ArmStrong Number";
		System.out.println(output);
	}
}
