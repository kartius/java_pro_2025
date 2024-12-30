package org.lessons.lesson_4.incapsulation.example;

import java.util.List;

public class Policman {

  public void checkSpeed(List<Auto> autos) {

    for (Auto auto : autos) {
      System.out.println(auto);
      if (auto.getSpeed() > 130) {
        System.out.println("Alarm! Stop please!!!");
      } else {
        System.out.println("OK");
      }
    }


  }
}
