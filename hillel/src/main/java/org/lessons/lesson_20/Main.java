package org.lessons.lesson_20;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {


  public static void main(String[] args) {
//    Queue queue = new LinkedList();
//    List list = new LinkedList<>();
//    Collections.synchronizedList(list);


    LinkedBlockingQueue<Integer> queue = new LinkedBlockingQueue<>();

    List<Thread> producers = IntStream.range(0, 10).mapToObj(
            i -> new Thread(() -> IntStream.range(0, 10).forEach(n -> queue.add(randomValue())))).toList();

    List<Thread> consumers = IntStream.range(0, 10).mapToObj(
            i -> new Thread(() -> IntStream.range(0, 10).forEach(n -> System.out.println(queue.poll())))).toList();

    producers.forEach(Thread::start);
    consumers.forEach(Thread::start);

  }

  private static Integer randomValue() {
    int min = 0;
    int max = 10000;
    return ThreadLocalRandom.current().nextInt(min, max - 1);
  }
}
