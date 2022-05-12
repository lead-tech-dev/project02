package com.hemebiotech.analytics;

import java.util.List;

public class AnalyticsCounter {

	public static void main(String args[]) throws Exception {
		ISymptomReader iSymptomReader = new ReadSymptomDataFromFile("symptoms.txt");
		ISymptomCounter iSymptomCounter = new SymptomCounterImpl();
		ISymptomWriter iSymptomWriter = new WriteSymptomDataToFile("result.out");

		List<String> symptomList = iSymptomReader.GetSymptoms();
		List<String> symptomListCount = iSymptomCounter.countSortSymptomList(symptomList);

		iSymptomWriter.SetSymptoms(symptomListCount);
	}
}
