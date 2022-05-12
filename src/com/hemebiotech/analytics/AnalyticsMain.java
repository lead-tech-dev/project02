package com.hemebiotech.analytics;

import java.util.List;

public class AnalyticsMain {
    public static void main(String[] args) {
        AnalyticsCounter analyticsCounter = new AnalyticsCounter(new ReadSymptomDataFromFile("symptoms.txt"),
                new WriteSymptomDataToFile("result.out"), new SymptomCountImpl());

        List<String> symptomList = analyticsCounter.getListSymptom();

        List<String> symptomCountSortList = analyticsCounter.getCountSortListSymptom(symptomList);

        analyticsCounter.setListSymptom(symptomCountSortList);

        symptomCountSortList.forEach(current -> System.out.println(current));
    }
}
