package io.github.saumasaha.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class MyArrayList<E> extends ArrayList<E> {
  public MyArrayList() {
  }

  @Override
  public boolean add(E e) {
    return super.add(e);
  }

  public List<E> filter(Predicate<E> predicate) {
    List<E> newList = new MyArrayList<>();
    for (E e : this) {
      if (predicate.test(e)) newList.add(e);
    }

    return newList;
  }

  public <T> List<T> map(Function<E, T> mapper) {
    List<T> newList = new MyArrayList<>();
    for (E e : this) {
      T newElem = mapper.apply(e);
      newList.add(newElem);
    }

    return newList;
  }

  public <T> T reduce(BiFunction<T, E, T> reducer, T context) {
    T newContext = context;
    for (E e : this) {
      newContext = reducer.apply(newContext, e);
    }

    return newContext;
  }

  public E reduce(BiFunction<E, E, E> reducer) {
    E newContext = this.get(0);
    for (E e : this.subList(1, this.size())) {
      newContext = reducer.apply(newContext, e);
    }

    return newContext;
  }
}
