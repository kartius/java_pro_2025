package org.lessons.lesson_25_patterns.bridge;

public class AdvancedRemoteController extends RemoteControl {
  public AdvancedRemoteController(Device device) {
    super(device);
  }

  @Override
  void powerOn() {
    System.out.println("Advanced Remote: ");
    device.turnOn();

  }

  @Override
  void powerOf() {
    System.out.println("Advanced Remote: ");
    device.turnOf();
  }
}
