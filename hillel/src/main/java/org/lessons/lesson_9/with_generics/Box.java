package org.lessons.lesson_9.with_generics;

import org.lessons.lesson_5.inheritenc.B;

import java.util.ArrayList;

public class Box<T> {

  private T item;

  public T getItem() {
    return item;
  }

  public void setItem(T item) {
    this.item = item;
  }

  public <T> void print (T t) {
    System.out.println(t);
  }


  public static void main(String[] args) {
    Box<Integer> boxInt = new Box<>();
    boxInt.setItem(12);

    Box<String> boxStr = new Box<>();
    boxStr.setItem("dsfdsf");



    boxInt.print("trtrtr");
    boxInt.print(434343);
    boxInt.print(new Object());
    boxInt.print(new ArrayList<>());
  }





}
