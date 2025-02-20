package org.lessons.lesson_16;

@FunctionalInterface
public interface TestInterface {

  int calculate(int a1, int a2);

  default String getConstant(){
    return "I'm constant string";
  }

}
