package io.github.saumasaha.practice;

public class ExpensivePencil extends Pencil{
  public ExpensivePencil() {
    super(20);
  }

  public ExpensivePencil(int durable) {
    super(durable);
  }

  public void expensiveWriting() {
    System.out.println("Expensive Writing...");
  }

  @Override
  public String toString() {
    return "Expensive Writing{durable=%d}".formatted(super.durable);
  }
}
