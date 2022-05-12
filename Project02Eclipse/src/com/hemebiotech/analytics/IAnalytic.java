package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;

/**
 * Count the symptoms occurences contained in symptoms.txt and create a result
 * document named result.out
 * 
 * @author marcm
 *
 */

public interface IAnalytic {

	public List<String> readDocument(String path);

	public List<String> sortInAlphabeticOrder(List<String> list);

	public TreeMap<String, Integer> countOccurencesInAList(List<String> list);

	public void createDocument(TreeMap<String, Integer> treeMap, String path);

}
