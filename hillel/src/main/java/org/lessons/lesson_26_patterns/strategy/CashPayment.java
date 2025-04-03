package org.lessons.lesson_26_patterns.strategy;

public class CashPayment implements PaymentStrategy{
  @Override
  public void pay(int amount) {
    System.out.println("Paid $" + amount + " using cash");

  }
}
