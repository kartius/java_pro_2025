package org.lessons.lesson_25_patterns.facade;

public class CPU {

  void freeze() {
    System.out.println("CPU frozen");
  }

  void jump(long position) {
    System.out.println("Jumping to position: " + position);
  }

  void execute() {
    System.out.println("Executing instructions");
  }
}
