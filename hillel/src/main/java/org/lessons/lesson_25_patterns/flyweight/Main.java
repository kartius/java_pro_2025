package org.lessons.lesson_25_patterns.flyweight;

public class Main {


  public static void main(String[] args) {
    Shape shape1 = ShapeFlyweightFactory.getShape("Red");
    shape1.draw(1,2);

    Shape shape2 = ShapeFlyweightFactory.getShape("Green");
    shape2.draw(1,2);

    Shape shape3 = ShapeFlyweightFactory.getShape("Black");
    shape3.draw(1,2);

    Shape shape4 = ShapeFlyweightFactory.getShape("Red");
    shape4.draw(1,2);
  }
}
