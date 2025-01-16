package org.lessons.lesson_8;

public class Main {


  public static void main(String[] args) {
      dividingOperation(4, 0);
  }

  static void dividingOperation(int i, int j) {
    if (j==0) {
      throw new CustomHillelArithmeticException("j can't be null");
    }
    System.out.println(i / j);
  }
}
