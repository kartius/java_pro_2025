package org.lessons.lesson_26_patterns.command;

public class FlipUpCommand implements Command {

  private Light light;

  public FlipUpCommand(Light light) {
    this.light = light;
  }

  @Override
  public void execute() {
    light.turnOn();
  }
}
