package com.epam.mjc.collections.map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> map = new HashMap<>();

        List<String> words = Arrays.stream(sentence.split("[,:;]? |[.]")).collect(Collectors.toList());
        words = words.stream().map(word -> word.toLowerCase()).collect(Collectors.toList());

        for(int i = 0; i < words.size(); i++) {
            String word = words.get(i);
            if (word.length() > 0) {
                map.put(word, countOccurrencesOf(word, words));
            }
        }

        return map;
    }

    private int countOccurrencesOf(String word, List<String> words) {
        int count = 0;

        for (int i = 0; i < words.size(); i++) {
            if (word.equals(words.get(i))) {
                count++;
            }
        }

        return count;
    }
}
