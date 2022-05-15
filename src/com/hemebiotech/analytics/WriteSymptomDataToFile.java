package com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * Simple brute force implementation
 *
 */
public class WriteSymptomDataToFile implements ISymptomWriter {

	/**
	 * field that must contain the path of output result
	 * 
	 */
	private String filepath;

	/**
	 * 
	 * @param filepath a full or partial path to contain the output result
	 */
	public WriteSymptomDataToFile(String filepath) {
		this.filepath = filepath;
	}

	/**
	 * 
	 * {@inheritDoc}
	 * 
	 */
	@Override
	public void setSymptoms(Map<String, Long> symptoms) {

		if (filepath != null) {
			try {

				BufferedWriter writer = new BufferedWriter(
						new FileWriter(filepath));
				System.out.println(symptoms);

				for (Map.Entry<String, Long> entry : symptoms.entrySet()) {
					System.out.println(entry.getKey() + "=" + entry.getValue());
					writer.write(entry.getKey() + "=" + entry.getValue());

					writer.newLine();
				}

				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
