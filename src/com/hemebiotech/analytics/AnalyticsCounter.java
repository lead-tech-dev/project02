package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

/**
 * The Class AnalyticsCounter. handles the business logic of the symptom
 */
public class AnalyticsCounter {

	/**
	 * field that must contain the reference of objects that have implemented the
	 * interface
	 * ISymptomReader.
	 */
	private ISymptomReader iSymptomReader;

	/**
	 * field that must contain the reference of objects that have implemented the
	 * interface
	 * ISymptomCount.
	 */
	private ISymptomCount iSymptomCounter;

	/**
	 * field that must contain the reference of objects that have implemented the
	 * interface
	 * ISymptomWriter.
	 */
	private ISymptomWriter iSymptomWriter;

	public AnalyticsCounter(ReadSymptomDataFromFile readSymptomDataFromFile,
			WriteSymptomDataToFile writeSymptomDataToFile) {
		this.iSymptomReader = readSymptomDataFromFile;
		this.iSymptomWriter = writeSymptomDataToFile;
		this.iSymptomCounter = new SymptomCountImpl();
	}

	/**
	 * getListSymptom. Method that gets the list of symptom
	 *
	 * @return symptoms list
	 */
	public List<String> getListSymptom() {
		return iSymptomReader.getSymptoms();
	}

	/**
	 * getCountSortListSymptom. method that get the list containing the number of
	 * each symptom sorted
	 *
	 * @param symptoms the symptoms list
	 * @return the count symptom list
	 */
	public Map<String, Long> getCountSortListSymptom(List<String> symptomList) {
		return iSymptomCounter.countSortSymptomList(symptomList);
	}

	/**
	 * setListSymptom. Method that save the list to data source
	 *
	 * @param symptomList the symptoms list
	 */
	public void setListSymptom(Map<String, Long> symptomList) {
		iSymptomWriter.setSymptoms(symptomList);
	}

}
