package io.github.saumasaha.practice;

public class MyNode extends Node<Integer> {
  public MyNode(Integer data) { super(data); }

  public void greet(Integer a) {
    System.out.println("hii from my node");
  }

  public void setData(Integer data) {
    System.out.println("MyNode.setData");
    super.setData(data);
  }
}

