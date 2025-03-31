package org.lessons.lesson_25_patterns.compositor;

public class Product implements Element {

  private int price;

  public Product(int price) {
    this.price = price;
  }

  @Override
  public int getPrice() {
    return price;
  }
}
