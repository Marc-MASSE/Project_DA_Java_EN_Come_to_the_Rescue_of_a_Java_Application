package com.hemebiotech.analytics;

import java.io.IOException;

public interface IDocumentCreator {
	/**
	 * To create result.out document based on the TreeMap created by
	 * OccurenceCounterList
	 * 
	 * @author marcm
	 * @throws IOException
	 */
	void create();
}
