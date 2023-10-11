package io.github.saumasaha.practice;

public class SuperExpensivePencil extends  ExpensivePencil{
  public SuperExpensivePencil() {
    super(30);
  }

  public void superExpensiveWriting() {
    System.out.println("Super Expensive Writing...");
  }

  @Override
  public String toString() {
    return "SuperExpensivePencil{durable=%d}".formatted(super.durable);
  }
}
