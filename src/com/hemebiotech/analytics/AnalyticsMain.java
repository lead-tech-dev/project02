package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

/**
 * The Analytics Main class get a list of symptoms from symp ms.txt and then,
 * inaly save result to reslut.out
 * 
 * @author Eric Maximan
 * 
 */
public class AnalyticsMain {

    /**
     * The main method is where the logics are created.
     */
    public static void main(String[] args) {
        AnalyticsCounter analyticsCounter = new AnalyticsCounter(new ReadSymptomDataFromFile("symptoms.txt"),
                new WriteSymptomDataToFile("result.out"), new SymptomCountImpl());

        List<String> symptomList = analyticsCounter.getListSymptom();

        if (symptomList.size() != 0) {
            Map<String, Long> symptomCountSortList = analyticsCounter.getCountSortListSymptom(symptomList);

            analyticsCounter.setListSymptom(symptomCountSortList);
        } else {
            throw new FileEmptyException("Le fichier de syptoms est vide !");
        }

    }
}
