package io.github.saumasaha.practice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

  public static List<Intern> getInterns() {
    Intern biswa = new Intern("Biswa", 22);
    Intern swagato = new Intern("Swagato", 2);
    Intern sauma = new Intern("Sauma", 21);

    List<Intern> interns = new ArrayList<>();
    interns.add(biswa);
    interns.add(sauma);
    interns.add(swagato);

    return interns;
  }

  public static MyArrayList<Integer> createNumbers() {
    MyArrayList<Integer> list = new MyArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);

    return list;
  }

  public static void main(String[] args) {
    List<Intern> interns = getInterns();
    Comparator<Intern> c = Comparator.comparing(Intern::getAge);

    MyArrayList<Integer> list = createNumbers();

    List<Integer> evenNumbers = list.filter(a -> a % 2 == 0);
    List<Boolean> plusOne = list.map(a -> true);
    Integer sum = list.reduce(Integer::sum);
    System.out.println(list.map(Integer::doubleValue));

    System.out.println(evenNumbers);
    System.out.println(plusOne);
    System.out.println(sum);
  }
}
