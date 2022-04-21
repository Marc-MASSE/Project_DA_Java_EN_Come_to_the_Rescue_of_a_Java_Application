package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;

public class OccurenceCounterList {

	List<String> list;

	public OccurenceCounterList(List<String> list) {
		this.list = list;
	}

	public TreeMap<String, Integer> count(List<String> list) {

		/*
		 * Initialisation de la TreeMap Son premier élément a pour clé le premier
		 * élément de la list et pour valeur 1
		 */
		String key;
		TreeMap<String, Integer> treeMap = new TreeMap<>();
		treeMap.put(list.get(0), 1);

		for (int i = 1; i < list.size(); i++) {
			key = list.get(i);

			/*
			 * Si l'élément suivant de la liste est identique au précédent, l'élément
			 * TreeMap de clé key voit sa valeur augmenter de 1
			 */
			if (list.get(i) == list.get(i - 1)) {
				int value = treeMap.get(key);
				treeMap.replace(key, value++);
			}
			/*
			 * Sinon, un nouvel élément est ajouté à la TreeMap avec comme clé key et comme
			 * valeur 1
			 */
			else {
				System.out.println("index : " + key);
				treeMap.put(key, 1);
			}
		}
		return treeMap;
	}

}
