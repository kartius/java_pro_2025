package org.lessons.lesson_9.generic_extend_and_implement;

public class Phone extends Product implements Comparable<Phone>{


  @Override
  public int compareTo(Phone o) {
    return 0;
  }
}
