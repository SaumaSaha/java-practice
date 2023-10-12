package io.github.saumasaha.practice;

import java.util.Objects;

/**
 * The type Intern.
 */
public class Intern {
  private final String name;
  private final int age;

  /**
   * Instantiates a new Intern.
   *
   * @param name name
   * @param age  age
   */
  public Intern(String name, int age) {
    this.name = name;
    this.age = age;
  }

  /**
   * Gets age.
   *
   * @return int
   */
  public int getAge() {
    return this.age;
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
   *
   * @return int
   */
  @Override
  public int hashCode() {
    return Objects.hash(this.name, this.age);
  }


  /**
   * Can vote if the intern is of age 18 or above.
   *
   * @return boolean
   */
  public boolean canVote() {
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
