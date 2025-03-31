package org.lessons.lesson_25_patterns.bridge;

public class BridgeDemo {


  public static void main(String[] args) {
    Device TV = new TV();
    Device radio = new Radio();

    RemoteControl basicControl = new BasicRemoteController(TV);

    basicControl.powerOn();
    basicControl.powerOf();

    RemoteControl advancedControl = new AdvancedRemoteController(radio);
    advancedControl.powerOn();
    advancedControl.powerOf();
  }
}
