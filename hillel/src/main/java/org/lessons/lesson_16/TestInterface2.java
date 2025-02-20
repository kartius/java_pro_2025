package org.lessons.lesson_16;

public interface TestInterface2 {


  default String getConstant(){
    return "I'm constant string from Interface 2";
  }
}
