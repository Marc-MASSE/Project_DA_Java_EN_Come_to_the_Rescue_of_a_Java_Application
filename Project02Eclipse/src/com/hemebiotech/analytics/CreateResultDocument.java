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
	private String path;

	/**
	 * To create result.out document based on the TreeMap created by
	 * OccurenceCounterList
	 * 
	 * @param treeMap
	 */

	public CreateResultDocument(TreeMap<String, Integer> treeMap, String path) {
		this.treeMap = treeMap;
		this.path = path;
	}

	@Override
	public void create() throws IOException {

		FileWriter writer = new FileWriter(path);

		// to browse through all treeMap keys
		Set<String> keys = treeMap.keySet();

		for (String key : keys) {
			writer.write(key + " : " + treeMap.get(key) + "\n");
		}
		writer.close();
	}

}
