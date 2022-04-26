package com.hemebiotech.analytics;

import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

/**
 * Simple brute force implementation
 *
 */

public class OccurenceCounterList implements IOccurenceCounter {

	private List<String> list;

	/**
	 * To count the number of occurrences of symptoms in list
	 * 
	 * @param list
	 */

	public OccurenceCounterList(List<String> list) {
		this.list = list;
	}

	@Override
	public TreeMap<String, Integer> getOccurences() {

		TreeMap<String, Integer> treeMap = new TreeMap<>();

		for (String key : list) {
			if (!treeMap.containsKey(key)) {
				treeMap.put(key, Collections.frequency(list, key));
			}

		}

		return treeMap;
	}

}
