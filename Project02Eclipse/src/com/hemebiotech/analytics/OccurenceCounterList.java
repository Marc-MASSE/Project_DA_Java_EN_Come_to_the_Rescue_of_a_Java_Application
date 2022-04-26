package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;

/**
 * Simple brute force implementation
 *
 */

public class OccurenceCounterList implements IOccurenceCounter {

	private List<String> list;

	/**
	 * To count the number of occurrences of symptoms in list
	 * 
	 * @param list
	 */

	public OccurenceCounterList(List<String> list) {
		this.list = list;
	}

	@Override
	public TreeMap<String, Integer> getOccurences() {

		/*
		 * Initialisation de la TreeMap Son premier élément a pour clé le premier
		 * élément de list et pour valeur 1
		 */

		TreeMap<String, Integer> treeMap = new TreeMap<>();
		treeMap.put(list.get(0), 1);

		for (int i = 1; i < list.size(); i++) {

			String key;
			int value;

			key = list.get(i);

			/*
			 * Si l'élément suivant de list est identique au précédent, l'élément TreeMap de
			 * clé key voit sa valeur augmenter de 1
			 */
			if (list.get(i).equals(list.get(i - 1))) {
				value = treeMap.get(key);
				treeMap.replace(key, value + 1);
			}
			/*
			 * Sinon, un nouvel élément est ajouté à la TreeMap avec comme clé key et comme
			 * valeur 1
			 */
			else {
				treeMap.put(key, 1);
			}
		}
		return treeMap;
	}

}
