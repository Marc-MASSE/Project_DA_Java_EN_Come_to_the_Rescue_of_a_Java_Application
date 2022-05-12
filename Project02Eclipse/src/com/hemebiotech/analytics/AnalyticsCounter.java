package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.List;
import java.util.TreeMap;

/**
 * Count the symptoms occurences contained in symptoms.txt and create a result
 * document named result.out
 * 
 * @author marcm
 *
 */

public class AnalyticsCounter {

	public static void main(String[] args) throws IOException {

		mainProgram();

	}

	private static void mainProgram() {
		String pathToSymptomsDocument = "Project02Eclipse/symptoms.txt";
		String pathToResultDocument = "Project02Eclipse/result.out";
		List<String> listToOrder;
		List<String> orderedList;
		TreeMap<String, Integer> symptomsTree = new TreeMap<>();

		IAnalytic analytic = new Analytic();

		listToOrder = analytic.readDocument(pathToSymptomsDocument);

		orderedList = analytic.sortInAlphabeticOrder(listToOrder);

		symptomsTree = analytic.countOccurencesInAList(orderedList);

		analytic.createDocument(symptomsTree, pathToResultDocument);
	}

}
