package org.lessons.lesson_24_patterns.adapter;

public class Main {
  public static void main(String[] args) {
    Train train = new Train();

    Railway railway = new Railway();
    railway.add(train);

    CarAdapter carAdapter = new CarAdapter(new Car());

    railway.add(carAdapter);
  }
}
