package org.lessons.lesson_9.abstract_generics;

import java.util.ArrayList;
import java.util.List;

public class PassengersSitToCarProcessor extends Processor<List<Passenger>, Car>{
  public PassengersSitToCarProcessor(String id, String type, List<Passenger> data) {
    super(id, type, data);
  }

  @Override
  public Car process() {
    return new Car(data);
  }


  public static void main(String[] args) {
    List<Passenger> passengers = new ArrayList<>();
    passengers.add(new Passenger("Bob"));
    passengers.add(new Passenger("Bob2"));

    PassengersSitToCarProcessor processor= new PassengersSitToCarProcessor("","",passengers);
    System.out.println(processor.process());
  }
}
