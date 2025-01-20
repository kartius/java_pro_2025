package org.lessons.lesson_9.abstract_generics;

import java.util.List;

public class Car {


  private List<Passenger> passengers;


  public Car(List<Passenger> passengers) {
    this.passengers = passengers;
  }


  public List<Passenger> getPassengers() {
    return passengers;
  }


  @Override
  public String toString() {
    return "Car{" +
            "passengers=" + passengers +
            '}';
  }
}

