package com.hemebiotech.analytics;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Anything that will update symptom source data
 * 
 */
public class SymptomCountImpl implements ISymptomCount {

    /**
     * 
     * {@inheritDoc}
     * 
     */
    @Override
    public Map<String, Long> countSortSymptomList(List<String> symptoms) {
        TreeMap<String, Long> treeMap = new TreeMap<>(Comparator.naturalOrder());

        Map<String, Long> count = symptoms.stream()
                .collect(
                        Collectors.groupingBy(Function.identity(), Collectors.counting()));

        treeMap.putAll(count);

        return treeMap;
    }

}
