package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

public class FunctionValueFinder {
    public boolean isFunctionValuePresent(List<Integer> sourceList, int requiredValue) {
        Map<Integer, Integer> functionMap = calculateFunctionMap(sourceList);

        return new TreeSet<Integer>(functionMap.values()).contains(requiredValue);
    }

    private Map<Integer, Integer> calculateFunctionMap(List<Integer> sourceList) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i : sourceList) {
            map.put(i, 5*i+2);
        }

        return map;
    }
}
