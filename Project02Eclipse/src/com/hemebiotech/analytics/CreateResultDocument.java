package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Set;
import java.util.TreeMap;

public class CreateResultDocument {

	TreeMap<String, Integer> treeMap = new TreeMap<>();

	public CreateResultDocument(TreeMap<String, Integer> treeMap) throws IOException {
		this.treeMap = treeMap;

		FileWriter writer = new FileWriter("Project02Eclipse/result.out");

		Set<String> keys = treeMap.keySet();

		for (String key : keys) {
			writer.write(key + " : " + treeMap.get(key) + "\n");
		}
		writer.close();
	}

}
