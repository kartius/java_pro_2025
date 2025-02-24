package org.lessons.lesson_17;

import java.util.List;

public class Car {

  private int id;
  private List<Passanger> passangersList;

  public Car(int id, List<Passanger> passangersList) {
    this.id = id;
    this.passangersList = passangersList;
  }

  public int getId() {
    return id;
  }

  public List<Passanger> getPassangersList() {
    return passangersList;
  }

  @Override
  public String toString() {
    return "Car{" +
            "id=" + id +
            ", passangersList=" + passangersList +
            '}';
  }
}
