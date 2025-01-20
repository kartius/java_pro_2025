package org.lessons.lesson_9.recursive_generecs_type;

public abstract class Product<T> implements Comparable<T> {

  public abstract int compareTo(T t);
}
