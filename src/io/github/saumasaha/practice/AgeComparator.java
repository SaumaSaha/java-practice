package io.github.saumasaha.practice;

import java.util.Comparator;

public class AgeComparator implements Comparator<Intern> {
  @Override
  public int compare(Intern obj1, Intern obj2) {
    return obj1.getAge() - obj2.getAge();
  }
}
