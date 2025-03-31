package org.lessons.lesson_25_patterns.bridge;

public abstract class RemoteControl {
  protected Device device;

  public RemoteControl(Device device) {
    this.device = device;
  }

  abstract void powerOn();

  abstract void powerOf();
}
