package io.github.saumasaha.practice;

public class Pencil {
  public int durable;

  public Pencil() {
    this.durable = 10;
  }

  public Pencil(int durable) {
    this.durable = durable;
  }


  public void write() {
    System.out.println("Writing...");
  }

  @Override
  public String toString() {
    return "Pencil{durable=%d}".formatted(durable);
  }
}
