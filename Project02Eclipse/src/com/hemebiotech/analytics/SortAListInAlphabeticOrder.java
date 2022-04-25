package com.hemebiotech.analytics;

import java.util.Collections;
import java.util.List;

/**
 * Simple brute force implementation
 * 
 * @author marcm
 */

public class SortAListInAlphabeticOrder implements ISortAList {

	private List<String> list;

	/**
	 * @param list, a List<String> to sort in alphabetic order
	 */
	public SortAListInAlphabeticOrder(List<String> list) {
		this.list = list;
	}

	@Override
	public List<String> getSortedList() {
		Collections.sort(list);
		return list;
	}

}
