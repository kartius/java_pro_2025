package org.lessons.lesson_12;

public class MyRunnable implements Runnable {
  @Override
  public void run() {
    for (int i = 0; i < 100; i++) {
      try {
        Thread.sleep(100);
        System.out.println(Thread.currentThread().getName() + " index "+i);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    }
  }
}
