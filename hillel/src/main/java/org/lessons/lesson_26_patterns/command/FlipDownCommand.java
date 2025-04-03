package org.lessons.lesson_26_patterns.command;

public class FlipDownCommand implements Command {

  private Light light;

  public FlipDownCommand(Light light) {
    this.light = light;
  }

  @Override
  public void execute() {
    light.turnOf();
  }
}
