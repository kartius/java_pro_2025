package org.lessons.lesson_9.recursive_generecs_type;


import java.util.ArrayList;
import java.util.List;

public class Container<T extends Product<T> & Comparable<T>> {


  boolean find(List<? extends Product> products, Product p) {
    for (Product product : products) {
      if (p.equals(product)) {
        return true;
      }
    }
    return false;
  }


  public static void main(String[] args) {
    Container<Phone> container = new Container<>();
// TODO


    List<Camera> cameras = new ArrayList<>();
    Camera camera= new Camera();

    container.find(cameras, camera);

  }
}
