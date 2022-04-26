package com.hemebiotech.analytics;

import java.util.TreeMap;

public interface IOccurenceCounter {
	/**
	 * To count the number of occurrences of symptoms in a list
	 * 
	 * @author marcm
	 */
	TreeMap<String, Integer> getOccurences();
}
