package org.lessons.lesson_6;

public class Main {


  public static void main(String[] args) {
    selector(Directions.EAST);
    selector(Directions.NORTH);


    for (Directions directions : Directions.values()) {
      System.out.println("ENUM: "+ directions);
    }

    System.out.println(Directions.valueOf("EAST"));
  }


  public static void selector(Directions directions) {
    if (Directions.EAST == directions) {
      System.out.println("EAST");
    } else if (Directions.NORTH == directions) {
      System.out.println("NORTH");
    }


  }
}
