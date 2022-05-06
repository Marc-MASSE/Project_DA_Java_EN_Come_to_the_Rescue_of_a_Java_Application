package com.hemebiotech.analytics;

import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

/**
 * Simple brute force implementation
 *
 */

public class OccurenceCounterList implements IOccurenceCounter {

	private List<String> symptomsList;

	/**
	 * To count the number of occurrences of symptoms in list
	 * 
	 * @param list
	 */

	public OccurenceCounterList(List<String> list) {
		this.symptomsList = list;
	}

	@Override
	public TreeMap<String, Integer> getOccurences() {

		TreeMap<String, Integer> treeMap = new TreeMap<>();

		for (String symptom : symptomsList) {
			if (!treeMap.containsKey(symptom)) {
				treeMap.put(symptom, Collections.frequency(symptomsList, symptom));
			}

		}

		return treeMap;
	}

}
