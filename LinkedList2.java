package com.bridgelabz.linkedlist;

public class LinkedList2<E> {
	 Node<E> head;
	   Node<E> tail;

	    public void push(E key) {
	      Node<E> newNode = new Node<>(key); // next-> null
	      if(head == null) {
	          head = newNode;
	          tail = newNode;
	      }
	      else{
	         newNode.setNext(head); // newNode.next = head;
	          head = newNode;
	      }
	    }


	    void print(){
	        Node<E> temp = head;
	        while(temp!=null){
	            System.out.print(temp.getKey() + " ");
	            temp = temp.getNext();
	        }
	        System.out.println();
	    }


	    void add(){

	    }

}
