package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Set;
import java.util.TreeMap;

public class CreateResultDocument {

	TreeMap<String, Integer> treeMap = new TreeMap<>();

	public CreateResultDocument(TreeMap<String, Integer> treeMap) {
		this.treeMap = treeMap;
	}

	public void create(TreeMap<String, Integer> treeMap) throws IOException {

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
