package io.github.saumasaha.practice;

public abstract class Node<T> {

  public T data;

  public Node(T data) { this.data = data; }

  public void greet(T a) {
    System.out.println("Hii from Node");
  }

  public void setData(T data) {
    System.out.println("Node.setData");
    this.data = data;
  }
}
