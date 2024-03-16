package com.usman.csudh.csc311.datastructures;

public interface Map {
	
	public void put(String key, String value);
	
	/**
	 * 
	 * @param key
	 * @return value or NULL if the key is not found
	 */
	public String get(String key);

}
