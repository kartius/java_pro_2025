package org.lessons.lesson_12.wait_notify;

public class Notifier implements Runnable {

  private Message message;

  public Notifier(Message message) {
    this.message = message;
  }

  @Override
  public void run() {
    String name = Thread.currentThread().getName();
    System.out.println(name + " started");
    try {
      Thread.sleep(1000);
      synchronized (message) {
        System.out.println(name + " notify time: " + System.currentTimeMillis());
        //message.notify();
        message.notifyAll();
      }
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

  }
}
