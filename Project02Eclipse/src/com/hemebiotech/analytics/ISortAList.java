package com.hemebiotech.analytics;

import java.util.List;

/**
 * To sort a List<String>
 * 
 * @author marcm
 */

public interface ISortAList {

	/**
	 * @return a List<String> in alphabetic order
	 */
	List<String> getSortedList(List<String> list);
}
