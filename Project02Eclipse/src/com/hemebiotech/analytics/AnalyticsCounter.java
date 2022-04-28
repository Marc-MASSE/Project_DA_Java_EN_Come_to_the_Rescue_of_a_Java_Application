package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.List;
import java.util.TreeMap;

public class AnalyticsCounter {

	public static void main(String[] args) throws IOException {

		String pathToSymptomsDocument = "Project02Eclipse/symptoms.txt";
		String pathToResultDocument = "Project02Eclipse/result.out";
		List<String> listToOrder;
		List<String> orderedList;
		TreeMap<String, Integer> symptomsTree = new TreeMap<>();

		listToOrder = readDocument(pathToSymptomsDocument);

		orderedList = sortInAlphabeticOrder(listToOrder);

		symptomsTree = countOccurencesInAList(orderedList);

		createDocument(symptomsTree, pathToResultDocument);
	}

	private static List<String> readDocument(String path) {
		ISymptomReader symptomReader = new ReadSymptomDataFromFile(path);
		return symptomReader.getSymptoms();
	}

	private static List<String> sortInAlphabeticOrder(List<String> list) {
		ISortAList sortAList = new SortAListInAlphabeticOrder(list);
		return sortAList.getSortedList();
	}

	private static TreeMap<String, Integer> countOccurencesInAList(List<String> list) {
		IOccurenceCounter occurenceCounterList = new OccurenceCounterList(list);
		return occurenceCounterList.getOccurences();
	}

	private static void createDocument(TreeMap<String, Integer> treeMap, String path) {
		IDocumentCreator createResultDocument = new CreateResultDocument(treeMap, path);
		createResultDocument.create();
	}
}
