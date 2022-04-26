package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Set;
import java.util.TreeMap;

/**
 * Simple brute force implementation
 *
 */

public class CreateResultDocument implements IDocumentCreator {

	private TreeMap<String, Integer> treeMap = new TreeMap<>();

	/**
	 * To create result.out document based on the TreeMap created by
	 * OccurenceCounterList
	 * 
	 * @param treeMap
	 */

	public CreateResultDocument(TreeMap<String, Integer> treeMap) {
		this.treeMap = treeMap;
	}

	@Override
	public void create() throws IOException {

		FileWriter writer = new FileWriter("Project02Eclipse/result.out");

		// to browse through all treeMap keys
		Set<String> keys = treeMap.keySet();

		for (String key : keys) {
			writer.write(key + " : " + treeMap.get(key) + "\n");
			System.out.println(key + " : " + treeMap.get(key));
		}
		writer.close();
	}

}
