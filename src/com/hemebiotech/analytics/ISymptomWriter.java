package com.hemebiotech.analytics;

/**
 * Anything that will write symptom data to a source
 * The important part is, the return value from the operation,
 *  which is a void
 *
 * 
 */
import java.util.List;

public interface ISymptomWriter {

	/**
	 * Sets the symptoms. Method that saves a list of symptoms to a data source
	 *
	 * @param symptoms a list symptoms
	 * 
	 * @return void
	 */
	void SetSymptoms(List<String> symptoms);

}
