package com.hemebiotech.analytics;

import java.util.List;

public class AnalyticsCounter {
	private ISymptomReader iSymptomReader;
	private ISymptomCount iSymptomCounter;
	private ISymptomWriter iSymptomWriter;

	public AnalyticsCounter(ReadSymptomDataFromFile readSymptomDataFromFile,
			WriteSymptomDataToFile writeSymptomDataToFile, SymptomCountImpl symptomCountImpl) {
		this.iSymptomReader = readSymptomDataFromFile;
		this.iSymptomWriter = writeSymptomDataToFile;
		this.iSymptomCounter = symptomCountImpl;
	}

	public List<String> getListSymptom() {
		return iSymptomReader.getSymptoms();
	}

	public List<String> getCountSortListSymptom(List<String> symptomList) {
		return iSymptomCounter.countSortSymptomList(symptomList);
	}

	public void setListSymptom(List<String> symptomList) {
		iSymptomWriter.setSymptoms(symptomList);
	}

}
