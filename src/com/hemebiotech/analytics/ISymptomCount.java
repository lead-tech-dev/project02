package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

/**
 * The Interface ISymptomCount. anything that requires business logic on
 * symptoms
 * 
 */
public interface ISymptomCount {

  /**
   * CountSortSymptom. method that counts the number of occurrences of each
   * symptom
   * in the list and then sort
   *
   * @param symptom a list symptom
   * @return a list symptoms
   */
  Map<String, Long> countSortSymptomList(List<String> symptoms);

}
