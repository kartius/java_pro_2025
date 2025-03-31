package org.lessons.lesson_25_patterns.bridge;

public class BasicRemoteController extends RemoteControl {
  public BasicRemoteController(Device device) {
    super(device);
  }

  @Override
  void powerOn() {
    System.out.println("Basic Remote: ");
    device.turnOn();

  }

  @Override
  void powerOf() {
    System.out.println("Basic Remote: ");
    device.turnOf();
  }
}
