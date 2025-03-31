package org.lessons.lesson_24_patterns;

public class Singleton {
  //1  private static Singleton instance;
//
  private Singleton() {
  }
//
//  public static Singleton getInstance() {
//    if (instance == null) {
//      instance = new Singleton();
//    }
//    return instance;
//  }

  //2
  private static Singleton instance = new Singleton();

  public static Singleton getInstance() {
    return Singleton.instance;
  }


  //3





}
