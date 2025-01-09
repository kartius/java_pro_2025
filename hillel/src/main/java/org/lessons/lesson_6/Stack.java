package org.lessons.lesson_6;

public class Stack {


  public static void main(String[] args) {

    Stack main = new Stack();
    main.calculate(10);
  }

  public int calculate(int number) {
    return number * calculate(number - 1);
  }
}
