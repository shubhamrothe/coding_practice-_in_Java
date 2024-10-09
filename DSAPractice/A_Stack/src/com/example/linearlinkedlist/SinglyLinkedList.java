package com.example.linearlinkedlist;

public class SinglyLinkedList {

	private static class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
		
	}

	private Node head;
	
	public SinglyLinkedList() {
		super();
		head=null;
	}
	
	public void insertAtEnd(int data) {
		Node newNode = new Node(data);
		if(head==null) {
			head=newNode;
		}else {
			Node current= head;
			while(current.next !=null) {
				current=current.next;
			}
			current.next=newNode;
		}
			
	}
	
	//To remove element from the linkedlist
	public void removeFromLast() {
		if(head==null) {
			return;
		}if(head.next==null) {
			head=null;
			return;
		}else{
			Node current =head;
			while(current.next.next!=null) {
				current=current.next;
			}
			current.next=null;
		}
	}
	public void addAtFirst(int data) {
		Node newNode= new Node(data);
		if(head==null) {
			head=newNode;
		}
		if(head.next==null) {
			Node temp=head;
			head.next=newNode;
			newNode.next=temp;
		}
	}
	
}
