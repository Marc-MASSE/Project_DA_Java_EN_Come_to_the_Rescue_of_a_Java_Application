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

		// Read a document line by line
		ISymptomReader symptomReader = new ReadSymptomDataFromFile(pathToSymptomsDocument);
		listToOrder = symptomReader.getSymptoms();

		// Put symptomList in alphabetic order
		ISortAList sortAList = new SortAListInAlphabeticOrder(listToOrder);
		orderedList = sortAList.getSortedList();

		// Count symptoms occurences
		IOccurenceCounter occurenceCounterList = new OccurenceCounterList(orderedList);
		symptomsTree = occurenceCounterList.getOccurences();

		// Create symptoms document
		CreateResultDocument createResultDocument = new CreateResultDocument(symptomsTree, pathToResultDocument);
		createResultDocument.create();

	}

}
