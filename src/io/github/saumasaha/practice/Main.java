package io.github.saumasaha.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {
  public static void print(Box<? super ExpensivePencil> p) {
    p.t = new SuperExpensivePencil();
  }

  public static void main(String[] args) {
    Node<Integer> n = new MyNode(5);
    n.greet(1);
    n.setData(6);

    Box<Pencil> p = new Box<>(new Pencil());
    Box<ExpensivePencil> ep = new Box<>(new ExpensivePencil());
    Box<SuperExpensivePencil> sep = new Box<>(new SuperExpensivePencil());

    print(p);
    System.out.println(sep + " " + ep);

    Intern biswa1 = new Intern("Biswa", 22);
    Intern biswa2 = new Intern("Biswa", 22);
    Intern sauma = new Intern("Sauma", 21);

    Set<Intern> interns = new HashSet<>();
    ArrayList<Intern> newInterns = new ArrayList<>();
    newInterns.add(biswa1);
    newInterns.add(biswa2);
    newInterns.add(sauma);
    interns.add(biswa1);
    interns.add(biswa2);
    interns.add(sauma);

    System.out.println(newInterns);

    System.out.println(Intern.sort(newInterns, new AgeComparator()));

    System.out.println(interns);
  }
}
