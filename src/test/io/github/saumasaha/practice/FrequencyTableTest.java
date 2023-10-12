package io.github.saumasaha.practice;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FrequencyTableTest {
  @Test
  void getCharCount() {
    Map<Character, Integer> frequency = new HashMap<>();
    frequency.put('H', 1);
    frequency.put('e', 1);
    frequency.put('l', 2);
    frequency.put('o', 1);

    assertEquals(frequency, FrequencyTable.getCharCount("Hello"));

  }

  @Test
  void getMostFrequentLetter() {
    assertEquals(2, FrequencyTable.getMostFrequentLetter("Hello").getValue());
    assertEquals('l', FrequencyTable.getMostFrequentLetter("Hello").getKey());
  }
}