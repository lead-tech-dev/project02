package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SymptomCounterImpl implements ISymptomCounter {

    @Override
    public List<String> countSortSymptomList(List<String> symptoms) {

        Map<String, Long> count = symptoms.stream()
                .collect(
                        Collectors.groupingBy(Function.identity(), Collectors.counting()));

        List<String> sort = count.entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByKey())
                .map(e -> e.getKey() + "=" + e.getValue())
                .collect(Collectors.toList());

        return sort;
    }

}
