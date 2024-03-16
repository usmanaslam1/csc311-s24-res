package com.usman.csudh.csc311.datastructures.impl;
import com.usman.csudh.csc311.datastructures.Stack;
import com.usman.csudh.csc311.datastructures.List;
import com.usman.csudh.csc311.datastructures.ListInvalidIndexException;
import com.usman.csudh.csc311.datastructures.StackEmptyException;

/**
 * A linked list implementation of a stack. This implementation uses the List
 * interface to provide the stack functionality. 
 */
public class LinkedStack implements Stack {

	// List to hold the stack items
	List list=new LinkedList();
	
	//Pointer to the top of the stack
	int sPointer=0;
	
	
	/**
	 * Adds a new data item to the end of the list
	 * 
	 * @param data the data item to add to the list
	 */
	@Override
	public void push(int data) {
		list.add(data);
		sPointer++;
	}

	/**
	 * Removes and returns the data item at the end of the list
	 * 
	 * @return the data item at the end of the list
	 * @throws StackEmptyException
	 */
	@Override
	public int pop() throws StackEmptyException {
		try {
			return list.remove(--sPointer);
		}
		catch(ListInvalidIndexException e) {
            throwStackEmptyException();
        }
		return -1;
	}
	
	/**
	 * Returns the data item at the end of the list without removing it
	 * 
	 * @return the data item at the end of the list
	 * @throws StackEmptyException
	 */

	@Override
	public int peek() throws StackEmptyException {
		try {
			return list.get(sPointer-1);
		}
		catch(ListInvalidIndexException e) {
            throwStackEmptyException();
        }
		return -1;
	}
	
	/**
	 * Returns the number of items in the stack
	 * 
	 * @return the number of items in the stack
	 */

	@Override
	public int size() {
		return list.size();
	}
	
	/**
	 * Returns true if the stack is empty
	 * 
	 * @return true if the stack is empty
	 */

	@Override
	public boolean isEmpty() {
		return list.isEmpty();
	}
	
	/**
	 * Removes all items from the stack
	 */

	@Override
	public void clear() {
		list.clear();
		
	}
	
	private void throwStackEmptyException() throws StackEmptyException {
		throw new StackEmptyException("Stack is empty");
	}

}
