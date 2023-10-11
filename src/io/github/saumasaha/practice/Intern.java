package io.github.saumasaha.practice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class Intern {
  private final String name;
  private final int age;

  public Intern(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public int getAge() {
    return this.age;
  }

  public static List<Intern> sort (List<Intern> interns, Comparator<Intern> c) {
    List<Intern> sortedInterns = new ArrayList<>(interns);
    sortedInterns.sort(c);

    return sortedInterns;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || this.getClass() != obj.getClass()) return false;
    Intern intern = (Intern) obj;
    return this.age == intern.age && this.name == intern.name;
  }

  /**
   * This is method generates a hash code from the name and the age of the intern
   * @return int
   */
  @Override
  public int hashCode() {
    return Objects.hash(this.name, this.age);
  }

  /**
   * This is method generates a hash code from the name and the age of the intern
   * @return int
   */
  public boolean canVote( ) {
    return this.age >= 18;
  }

  @Override
  public String toString() {
    return "Intern{" +
        "name='" + this.name + '\'' +
        ", age=" + this.age +
        '}';
  }
}
