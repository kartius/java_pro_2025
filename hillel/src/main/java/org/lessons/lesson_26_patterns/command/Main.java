package org.lessons.lesson_26_patterns.command;

public class Main {


  public static void main(String[] args) {
    Light light = new Light();

    Command switchOn = new FlipUpCommand(light);
    Command switchOf = new FlipDownCommand(light);

    Switch switcher = new Switch();

    switcher.executeAndStore("ON", switchOn);
    switcher.executeAndStore("OFF", switchOf);

    switcher.getHistory().get("ON").execute();
  }
}
