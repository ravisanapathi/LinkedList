	package com.bridgelabz.linkedlist;

public class LinkedList  {
	public class Node {
		int data;
		Node link;
	/*	public Node(int data) {
			this.data = data;
			this.link = null;
		} */  

	}
		
		Node head = null;
		Node tail = null;
		int size = 0;
		public void addFirst(int data) {
			Node temp = new Node();
			temp.data = data;
			temp.link = null;
			if(head == null) {
				head = temp;
				tail = temp;
			}
			else {
				temp.link = head;
				head = temp;
			}
			size++;
		}
		public void addLast(int data) {
			Node temp = new Node();
			temp.data = data;
			temp.link = null;
			if(head == null) {
				head = temp;
				tail = temp;
			} else {
				tail.link = temp;
				tail = temp;
			}
			size++;
		}
	    public void print() {
	    	Node temp = head;
	    	
	    	while(temp != null) {
	    		System.out.println(temp.data);
	    		temp = temp.link;
	    	}
	    }
	
	public static void main(String[] args){
		LinkedList head = new LinkedList();
		head.addLast(56);
		head.addLast(30);
		head.addLast(70);
		head.print();
	}
	
}
