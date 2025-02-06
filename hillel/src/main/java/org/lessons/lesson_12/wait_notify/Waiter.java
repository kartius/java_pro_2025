package org.lessons.lesson_12.wait_notify;

public class Waiter implements Runnable {

  private Message message;

  public Waiter(Message message) {
    this.message = message;
  }

  @Override
  public void run() {
    String name = Thread.currentThread().getName();
    synchronized (message) {
      try {
        System.out.println(name + " waiting to get notified at time: " + System.currentTimeMillis());
        message.wait();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}
