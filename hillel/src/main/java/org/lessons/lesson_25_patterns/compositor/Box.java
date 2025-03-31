package org.lessons.lesson_25_patterns.compositor;

import java.util.List;

public class Box implements Element {

  private final List<Product> products;

  public Box(List<Product> products) {
    this.products = products;
  }

  @Override
  public int getPrice() {
    return products.stream().map(Product::getPrice).mapToInt(Integer::intValue).sum();
  }
}
