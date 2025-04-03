package org.lessons.lesson_26_patterns.strategy;

public class ShoppingCart {
  PaymentStrategy paymentStrategy;

  public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
    this.paymentStrategy = paymentStrategy;
  }

  public void checkout(int amount) {
    if (paymentStrategy != null) {
      paymentStrategy.pay(amount);
    }
  }

}
