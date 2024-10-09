package com.example.stack;

import java.util.Stack;

public class TwoStacksInArray {
    private int[] array;

    public TwoStacksInArray(Stack<Integer> stack1, Stack<Integer> stack2) {
        int size1 = stack1.size();
        int size2 = stack2.size();
        this.array = new int[size1 + size2];

        // Store elements from stack1 in the array
        int i = 0;
        while (!stack1.isEmpty()) {
            array[i++] = stack1.pop();
        }

        // Store elements from stack2 in the array
        while (!stack2.isEmpty()) {
            array[i++] = stack2.pop();
        }
    }

    public void printArray() {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);

        Stack<Integer> stack2 = new Stack<>();
        stack2.push(4);
        stack2.push(5);
        stack2.push(6);

        TwoStacksInArray ts = new TwoStacksInArray(stack1, stack2);
        ts.printArray();
    }
}