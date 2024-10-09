package com.example.stack;

import java.util.Stack;

public class BracketChecking {

	public static void main(String[] args) {
	//	String s1 = "{}";
		String s1 = "{[]}()[";
		boolean result = isBalanced(s1);
		System.out.println("Given expression is balanced :" + result);
	}

	private static boolean isBalanced(String s1) 
	{
		Stack<Character> stack = new Stack<Character>();
		for (char ch : s1.toCharArray()) 
		{
			if (ch == '[' || ch == '{' || ch == '(') 
			{
				stack.push(ch);
			} 
			else if (ch == ']' || ch == '}' || ch == ')') 
			{
				if (stack.isEmpty() || !isMatchingPairs(stack.pop(), ch)) 
				{
					return false;
				}
			}
		}				
// here we can simply return true because for strings like "{[]}()[" it gives true but in actual it is false
		return stack.isEmpty();
	}

	private static boolean isMatchingPairs(char opening, char closing) {

		return (opening =='[' && closing ==']')  ||  (opening =='{' && closing =='}')  ||  (opening =='(' && closing ==')');
		 
	}
}
