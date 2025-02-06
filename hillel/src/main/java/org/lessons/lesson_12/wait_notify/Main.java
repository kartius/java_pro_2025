package org.lessons.lesson_12.wait_notify;

public class Main {


  public static void main(String[] args) {
    Message message = new Message("I'm message");

    Waiter waiter = new Waiter(message);
    Waiter waiter1 = new Waiter(message);



    new Thread(waiter, "waiter").start();
    new Thread(waiter1, "waiter1").start();

    Notifier notifier = new Notifier(message);
    new Thread(notifier, "notifier").start();

  }
}
