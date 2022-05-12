package com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 * Simple brute force implementation
 *
 */
public class WriteSymptomDataToFile implements ISymptomWriter {

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
	public void setSymptoms(List<String> symptoms) {

		if (filepath != null) {
			try {

				BufferedWriter writer = new BufferedWriter(
						new FileWriter(filepath));

				for (String value : symptoms) {
					writer.write(value);

					writer.newLine();
				}
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
