package org.lessons.lesson_25_patterns.decorator;

public class TomatoDecorator extends PizzaDecorator {
  public TomatoDecorator(Pizza pizza) {
    super(pizza);
  }

  @Override
  public String getDescription() {
    return super.getDescription() + ", Tomato";
  }

  @Override
  public int getCost() {
    return super.getCost() + 3;
  }
}
