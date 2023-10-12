package io.github.saumasaha.practice;

import java.util.HashMap;
import java.util.Map;

public class FrequencyTable {
  public static Map<Character, Integer> getCharCount(String text) {
    char[] chars = text.toCharArray();

    Map<Character, Integer> table = new HashMap<>();
    for (char c : chars) {
      Integer count = table.getOrDefault(c, 0);
      table.put(c, count + 1);
    }

    return table;
  }

  public static Map.Entry<Character, Integer> getMostFrequentLetter(String text) {
    Map<Character, Integer> table = getCharCount(text);
    int maxCount = 0;
    Map.Entry<Character, Integer> pair = null;
    for (Map.Entry<Character, Integer> entry : table.entrySet()) {
      int currentCharCount = entry.getValue();
      if (maxCount < currentCharCount) {
        maxCount = currentCharCount;
        pair = entry;
      }
    }

    return pair;
  }
}
