package org.lessons.lesson_9.generic_extend_and_implement;

import java.util.ArrayList;
import java.util.List;

public class Container<T extends Product & Comparable<T>> {


  boolean find(List<? extends Product> products, Product p) {
    for (Product product : products) {
      if (p.equals(product)) {
        return true;
      }
    }
    return false;
  }


  public static void main(String[] args) {
    Container<Camera> container = new Container<>();

    List<Camera> cameras = new ArrayList<>();
    Camera camera= new Camera();

    container.find(cameras, camera);

  }
}
