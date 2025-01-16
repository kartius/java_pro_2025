package org.lessons.lesson_8;

import java.rmi.AlreadyBoundException;

public class Exceptions {

  static void checkedException(String message) throws RuntimeException {
    throw new RuntimeException("I 'm Exception " + message);
  }

  static void uncheckedException() {
    throw new RuntimeException("RuntimeException");
  }

  public static void main(String[] args) {
    try {
      checkedException("dfdfdf");
    } catch (ClassCastException e) {
      System.out.println("ClassCastException");


//    uncheckedException();
    }


  }
}
