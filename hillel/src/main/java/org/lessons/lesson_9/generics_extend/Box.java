package org.lessons.lesson_9.generics_extend;

import java.util.ArrayList;

public class Box<T extends Number> {

  private T item;

  public T getItem() {
    return item;
  }

  public void setItem(T item) {
    this.item = item;
  }


  public static void main(String[] args) {
    Box<Integer> boxInt = new Box<>();
    boxInt.setItem(12);

    Box<Double> boxdb = new Box<>();
    boxdb.setItem(5.6);

    final double result = boxdb.getItem() + boxInt.getItem();

    System.out.println(result);
  }





}
