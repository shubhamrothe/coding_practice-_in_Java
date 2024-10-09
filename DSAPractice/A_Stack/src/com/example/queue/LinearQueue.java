package com.example.queue;

import java.util.Scanner;

public class LinearQueue {

	private int front, rear, capacity;
	 private int[] queue;
	 
	 //this will create queue
	LinearQueue(int size){
		front=0;
		rear=-1;
		capacity=size;
		queue = new int[size];
	}
	
	//To check is empty or not
	public boolean isEmpty() {
		if(front>rear)
			return true;
		return false;
	}
	
	//To check is full or not
	public boolean isFull() {
		if(rear==capacity-1)
			return true;
		return false;
	}
	
	//To add element to queue from rear
	public void enQueue(int e) {
		if(!isFull()) {
			queue[++rear]=e;
		}else {
			System.out.println("Queue is full...!!");
		}	
	}
	
	//To remove front element from queue
	public int deQuque() {
		if(!isEmpty()) {
			int temp= queue[front];
			front++;
			return temp;
		}else {
			System.out.println("Queue is Empty...!!");
			return -1;
		}
	}
	
	//To return front element from queue
	public int peek() {
		if(!isEmpty()) {
			return queue[front];
		}else {
			System.out.println("Queue is Empty...!!");
			return -1;
		}
	}
	
	//To print queue
	public void printQueue() {
		for(int i=front; i<=rear; i++) {
			System.out.println(queue[i]);
		}	
	}
	
	public int size() {
		return rear-front+1;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter size of queue");
		int size = sc.nextInt();
		
		LinearQueue ob = new LinearQueue(size);
		ob.enQueue(1);
		
	}
}
