package org.lessons.lesson_5.polimorphism;

public class Main {

  public static void main(String[] args) {
    Tesla tesla = new Tesla();
    tesla.displayCurrentSpeed();

    Auto auto = new Auto() {
      @Override
      protected int getSpeed() {
        return 23;
      }
    };

    auto.displayCurrentSpeed();
  }
}
