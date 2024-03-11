package com.usman.csudh.csc311.datastructures;

public interface Queue {
	
	public void add(int data);
	public int remove() throws QueueEmptyException;
	public int peek() throws QueueEmptyException;
	public int size();
	public boolean isEmpty();
	public void clear();

}
