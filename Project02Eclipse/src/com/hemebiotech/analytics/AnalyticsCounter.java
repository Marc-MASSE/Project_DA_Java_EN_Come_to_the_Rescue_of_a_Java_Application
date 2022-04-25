package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.List;
import java.util.TreeMap;

public class AnalyticsCounter {

	public static void main(String[] args) throws IOException {

		String pathToSymptomsDocument = "Project02Eclipse/symptoms.txt";
		List<String> listToOrder;
		List<String> orderedList;
		TreeMap<String, Integer> symptomsTree = new TreeMap<>();

		// Read a document line by line
		ISymptomReader symptomReader = new ReadSymptomDataFromFile(pathToSymptomsDocument);
		listToOrder = symptomReader.getSymptoms();
		// System.out.println(listToOrder);

		// Put symptomList in alphabetic order
		// Collections.sort(orderedList);
		ISortAList sortAList = new SortAListInAlphabeticOrder(listToOrder);
		orderedList = sortAList.getSortedList();
		System.out.println(orderedList);

		// Count symptoms occurences
		OccurenceCounterList occurenceCounterList = new OccurenceCounterList(orderedList);
		symptomsTree = occurenceCounterList.count(orderedList);

		// Create symptoms document
		CreateResultDocument createResultDocument = new CreateResultDocument(symptomsTree);
		createResultDocument.create(symptomsTree);

	}

}
