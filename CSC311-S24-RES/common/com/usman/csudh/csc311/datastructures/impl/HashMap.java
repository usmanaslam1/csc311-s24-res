package com.usman.csudh.csc311.datastructures.impl;
import com.usman.csudh.csc311.datastructures.Map;

public class HashMap implements Map{
	
	//Buckets
	MapNode buckets[] = new MapNode[16];
	
	
	
	public int computeBucket(String key) {
		int hash = key.hashCode();
		
		//evaluate a value between 0 and 15
		int index = hash % buckets.length;
		return index;
	}
	
	
	public void tempPrintBuckets(){
		
		for (int i = 0; i < buckets.length; i++) {
			System.out.println(buckets[i]);
		}
	}
	
	public void put(String key, String value) {
		MapNode newNode = new MapNode(key, value);
		
		int bucket= computeBucket(key);
		MapNode head = buckets[bucket];
		
		
		if (head == null) {
			head = newNode;
			buckets[bucket] = head;
			return;
		}
		
		MapNode current = head;
		
		while (current.next != null) {
			current = current.next;
		
			//Ensure there is no duplicate key
			if (current.key.equals(key)) {
				current.value = value;
				return;
			}
		}	
		current.next = newNode;
	}

	@Override
	public String get(String key) {
		int bucket= computeBucket(key);
		MapNode head = buckets[bucket];
		//return null if the map is empty
		if (head == null) {
			return null;
		}
		
		//if map is not emptu then start from head
		// and keep moving to the next node until the key is found
		MapNode current = head;
		
		while (current != null) {
			if (current.key.equals(key)) {
				return current.value;
			}
			current = current.next;
		}
		return null;
	}
	
	public String toString() {
		String result = "{";
//		MapNode current = head;
//		while (current != null) {
//			result += current.key + " : " + current.value + "\n";
//			current = current.next;
//		}
		return result+="}";
	}

}
