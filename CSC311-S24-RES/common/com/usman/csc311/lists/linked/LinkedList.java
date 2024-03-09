package com.usman.csc311.lists.linked;

public class LinkedList {
	
	Node head;
	
	public LinkedList() {
		head = null;
	}
	
	public void add(int data) {
		Node newNode = new Node(data);
		if(head==null) {
			head = newNode;
		}
		else {
			Node current=head;
			
			// traverse the list until we get to the end
			while (current.next != null) {
				current = current.next;
			}
			current.next = newNode;
		}
	}
	
	public void insert(int index, int data) {
		Node newNode = new Node(data);
		if (index == 0) {
			newNode.next = head;
			head = newNode;
		} else {
			Node current = head;
			for (int i = 0; i < index - 1; i++) {
				current = current.next;
			}
			newNode.next = current.next;
			current.next = newNode;
		}
	}

}
