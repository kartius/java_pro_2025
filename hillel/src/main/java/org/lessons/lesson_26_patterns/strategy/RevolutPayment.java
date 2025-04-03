package org.lessons.lesson_26_patterns.strategy;

public class RevolutPayment implements PaymentStrategy {

  String accountName;

  public RevolutPayment(String accountName) {
    this.accountName = accountName;
  }

  @Override
  public void pay(int amount) {
    System.out.println("Paid $" + amount + " using revolut name: " + accountName);

  }
}
