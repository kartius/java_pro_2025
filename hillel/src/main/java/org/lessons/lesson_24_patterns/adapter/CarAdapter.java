package org.lessons.lesson_24_patterns.adapter;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CarAdapter extends Train {
  private Car car;

  @Override
  public void movingRails() {
    car.movingOnRoad();
  }
}
