package org.lessons.lesson_7;

public class MainChar {


  public static void main(String[] args) {
    char a = 'a';
//    System.out.println(a);
//
//    int i = 237;
//    a = (char) i;
//    System.out.println(i);
//    System.out.println(a);

    for (int j = 0; j < 1000; j++) {
      a = (char) j;
      System.out.println(j);
      System.out.println(a);
    }

  }
}
