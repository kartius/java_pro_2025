package org.lessons.lesson_14;


import java.util.ArrayList;
import java.util.List;

public class Benchmark {

  List<Integer> list;

  public Benchmark(List<Integer> list) {
    this.list = list;
  }

  void add() {
    long start = System.nanoTime();

    for (int i = 0; i < 10000000; i++) {
      list.add(i);
    }

    long result = System.nanoTime() - start;

    System.out.println("Time to add: " + result / 1000000 + " ms");

  }

  void get() {
    long start = System.nanoTime();

    for (int i = 0; i < 10000000; i++) {
      list.get(i);
    }

    long result = System.nanoTime() - start;

    System.out.println("Time to get : " + result / 1000000 + " ms");

  }


  public static void main(String[] args) {
    Benchmark benchmark = new Benchmark(new ArrayList<>());
    benchmark.add();
    benchmark.get();


  }
}

// Array list add with capacity 116 ms
// Array list add default capacity 160 ms
// Array list get default capacity 10 ms

// Linked list add default capacity 1020 ms
// Linked list get with capacity 1020 ms
