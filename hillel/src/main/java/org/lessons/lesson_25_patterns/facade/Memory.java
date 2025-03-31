package org.lessons.lesson_25_patterns.facade;

public class Memory {

  void load(long position, byte[] data) {
    System.out.println("Loading data at position: " + position);
  }
}
