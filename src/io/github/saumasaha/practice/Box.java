package io.github.saumasaha.practice;

public class Box<T> {
  public T t;

  public Box(T t) {
    this.t = t;
  }

  @Override
  public String toString() {
    return "Box{t=%s}".formatted(t);
  }
}
