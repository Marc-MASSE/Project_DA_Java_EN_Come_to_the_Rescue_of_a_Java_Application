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

public class Analytic implements IAnalytic {

	@Override
	public List<String> readDocument(String path) {
		ISymptomReader symptomReader = new ReadSymptomDataFromFile(path);
		return symptomReader.getSymptoms();
	}

	@Override
	public List<String> sortInAlphabeticOrder(List<String> list) {
		ISortAList sortAList = new SortAListInAlphabeticOrder(list);
		return sortAList.getSortedList();
	}

	@Override
	public TreeMap<String, Integer> countOccurencesInAList(List<String> list) {
		IOccurenceCounter occurenceCounterList = new OccurenceCounterList(list);
		return occurenceCounterList.getOccurences();
	}

	@Override
	public void createDocument(TreeMap<String, Integer> treeMap, String path) {
		IDocumentCreator createResultDocument = new CreateResultDocument(treeMap, path);
		createResultDocument.create();
	}
}
