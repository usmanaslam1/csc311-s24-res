package com.usman.csudh.csc311.datastructures;

public interface Stack {
	
	public void push(int data);
	public int pop() throws StackEmptyException;
	public int peek() throws StackEmptyException;
	public int size();
	public boolean isEmpty();
	public void clear();

}
