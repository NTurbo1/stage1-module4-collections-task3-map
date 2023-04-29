package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> map = new HashMap<>();

        for (Integer key : sourceMap.keySet()) {
            String value = sourceMap.get(key);
            if (map.containsKey(value)) {
                if (map.get(value) > key) {
                    map.put(value, key);
                }
            } else {
                map.put(value, key);
            }
        }

        return map;
    }
}
