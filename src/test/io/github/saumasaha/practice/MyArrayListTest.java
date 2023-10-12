package io.github.saumasaha.practice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MyArrayListTest {
  private MyArrayList<Integer> numbers;

  private MyArrayList<Intern> getInterns() {
    Intern sauma = new Intern("Sauma", 22);
    Intern milan = new Intern("Milan", 20);
    Intern biswa = new Intern("Biswa", 21);
    MyArrayList<Intern> interns = new MyArrayList<>();

    interns.add(sauma);
    interns.add(milan);
    interns.add(biswa);

    return interns;
  }

  private MyArrayList<Integer> getNumbers() {
    MyArrayList<Integer> numbers = new MyArrayList<>();

    numbers.add(3);
    numbers.add(1);
    numbers.add(2);

    return numbers;
  }

  @BeforeEach
  void setUp() {
    this.numbers = this.getNumbers();
  }

  @Test
  void filter() {
    List<Integer> expectedNumbers = new ArrayList<>();
    expectedNumbers.add(2);

    List<Integer> evenNumbers = this.numbers.filter(a -> a % 2 == 0);
    assertEquals(expectedNumbers, evenNumbers);
  }

  @Test
  void map() {
    List<Integer> expectedNumbers = new ArrayList<>();
    expectedNumbers.add(4);
    expectedNumbers.add(2);
    expectedNumbers.add(3);

    List<Integer> incrementedNumbers = this.numbers.map(a -> a + 1);
    assertEquals(expectedNumbers, incrementedNumbers);
  }

  @Test
  void reduce() {
    String expectedText = "312";
    String numText = this.numbers.reduce((a, b) -> a + b, "");
    assertEquals(expectedText, numText);
  }

  @Test
  void reduceWithoutContext() {
    Integer sum = 6;
    assertEquals(sum, this.numbers.reduce(Integer::sum));
  }

}