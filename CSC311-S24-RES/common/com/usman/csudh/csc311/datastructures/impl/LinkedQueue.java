package com.usman.csudh.csc311.datastructures.impl;
import com.usman.csudh.csc311.datastructures.List;
import com.usman.csudh.csc311.datastructures.ListInvalidIndexException;
import com.usman.csudh.csc311.datastructures.Queue;
import com.usman.csudh.csc311.datastructures.QueueEmptyException;

public class LinkedQueue implements Queue{
	
	List list=new LinkedList();

	@Override
	public void add(int data) {
		list.add(data);
		
	}

	@Override
	public int remove() throws QueueEmptyException {
		try {
			return list.remove(0);
		} catch (ListInvalidIndexException e) {
			throwQueueEmptyException();
		}
		return -1;
	}

	@Override
	public int peek() throws QueueEmptyException {
		try {
			return list.get(0);
		} catch (ListInvalidIndexException e) {
			throwQueueEmptyException();
		}
		return -1;
	}

	@Override
	public int size() {
		
		return list.size();
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return list.isEmpty();
	}

	@Override
	public void clear() {
		list.clear();
		
	}
	
	private void throwQueueEmptyException() throws QueueEmptyException {
		throw new QueueEmptyException("Queue is empty");
	}
	

}
