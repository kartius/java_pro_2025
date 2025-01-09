package org.lessons.lesson_6;

import java.util.ArrayList;
import java.util.List;

public class Heap {


  public static void main(String[] args) throws InterruptedException {

    List<Object> list = new ArrayList<>();

    while (true) {
      Object o = new Object();
      Thread.sleep(100);
      list.add(o);
    }
  }
}
