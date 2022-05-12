package com.hemebiotech.analytics;

import java.util.List;

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
       List<String> countSortSymptomList(List<String> symptoms);

}
