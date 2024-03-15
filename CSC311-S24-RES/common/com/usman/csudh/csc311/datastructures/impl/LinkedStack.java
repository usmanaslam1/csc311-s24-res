package com.usman.csudh.csc311.datastructures.impl;
import com.usman.csudh.csc311.datastructures.Stack;
import com.usman.csudh.csc311.datastructures.List;
import com.usman.csudh.csc311.datastructures.ListInvalidIndexException;
import com.usman.csudh.csc311.datastructures.StackEmptyException;

public class LinkedStack implements Stack {

	List list=new LinkedList();
	int sPointer=0;
	
	@Override
	public void push(int data) {
		list.add(data);
		sPointer++;
	}

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

	@Override
	public int size() {
		return list.size();
	}

	@Override
	public boolean isEmpty() {
		return list.isEmpty();
	}

	@Override
	public void clear() {
		list.clear();
		
	}
	
	private void throwStackEmptyException() throws StackEmptyException {
		throw new StackEmptyException("Stack is empty");
	}

}
